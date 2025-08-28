package com.fnwd.nrreborn.block.manufactory;

import com.fnwd.nrreborn.block_entity.manufactory.ManufactoryBlockEntity;
import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.data_component.NRRDataComponents;
import com.fnwd.nrreborn.item.NRRItems;
import com.fnwd.nrreborn.util.ConfigurationTypes;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class ManufactoryBlock extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16, 16);
    public static final MapCodec<ManufactoryBlock> CODEC = simpleCodec(ManufactoryBlock::new);
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    public static final BooleanProperty WORKING = BooleanProperty.create("working");

    public ManufactoryBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WORKING, false));
    }

    @Override
    protected @NotNull MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return new ManufactoryBlockEntity(blockPos, blockState);
    }

    @Override
    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    protected void onRemove(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull BlockState newState, boolean movedByPiston) {
        if (state.getBlock() != newState.getBlock()) {
            if (level.getBlockEntity(pos) instanceof ManufactoryBlockEntity manufactoryBlockEntity) {
                manufactoryBlockEntity.drops();
                level.updateNeighbourForOutputSignal(pos, this);
            }
        }
        super.onRemove(state, level, pos, newState, movedByPiston);
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
        if (level.getBlockEntity(pos) instanceof ManufactoryBlockEntity manufactoryBlockEntity) {
            if (!level.isClientSide()) {
                if (!stack.is(NRRItems.IO_CONFIGURATOR.get())) {
                    player.openMenu(new SimpleMenuProvider(manufactoryBlockEntity, Component.translatable("title.nrreborn.manufactory")), pos);
                } else {
                    level.invalidateCapabilities(pos);
                    manufactoryBlockEntity.setChanged();
                    if (!player.isCrouching()) {
                        if (stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) == ConfigurationTypes.DISABLE_ALL) {
                            for (int i = 0; i < manufactoryBlockEntity.inputSideConfiguration.length; i++) {
                                Arrays.fill(manufactoryBlockEntity.inputSideConfiguration[i], false);
                            }
                            for (int i = 0; i < manufactoryBlockEntity.outputSideConfiguration.length; i++) {
                                Arrays.fill(manufactoryBlockEntity.outputSideConfiguration[i], false);
                            }
                            player.sendSystemMessage(Component.translatable("message.nrreborn.block_disable_all_sides"));
                        } else if (stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) >= ConfigurationTypes.INPUT_ITEM_SLOT_1 &&
                                stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) <= ConfigurationTypes.INPUT_ITEM_SLOT_4) {
                            manufactoryBlockEntity.inputSideConfiguration[hitResult.getDirection().get3DDataValue()][stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1] =
                                    !manufactoryBlockEntity.inputSideConfiguration[hitResult.getDirection().get3DDataValue()][stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1];
                        } else {
                            manufactoryBlockEntity.outputSideConfiguration[hitResult.getDirection().get3DDataValue()][stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5] =
                                    !manufactoryBlockEntity.outputSideConfiguration[hitResult.getDirection().get3DDataValue()][stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5];
                        }
                    } else {
                        if (stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) == ConfigurationTypes.DISABLE_ALL) {
                            for (int i = 0; i < manufactoryBlockEntity.inputSideConfiguration.length; i++) {
                                Arrays.fill(manufactoryBlockEntity.inputSideConfiguration[i], false);
                            }
                            for (int i = 0; i < manufactoryBlockEntity.outputSideConfiguration.length; i++) {
                                Arrays.fill(manufactoryBlockEntity.outputSideConfiguration[i], false);
                            }
                            player.sendSystemMessage(Component.translatable("message.nrreborn.block_disable_all_sides"));
                        } else if (stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) >= ConfigurationTypes.INPUT_ITEM_SLOT_1 &&
                                stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) <= ConfigurationTypes.INPUT_ITEM_SLOT_4) {
                            manufactoryBlockEntity.inputSideConfiguration[hitResult.getDirection().getOpposite().get3DDataValue()][stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1] =
                                    !manufactoryBlockEntity.inputSideConfiguration[hitResult.getDirection().getOpposite().get3DDataValue()][stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1];
                        } else {
                            manufactoryBlockEntity.outputSideConfiguration[hitResult.getDirection().getOpposite().get3DDataValue()][stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5] =
                                    !manufactoryBlockEntity.outputSideConfiguration[hitResult.getDirection().getOpposite().get3DDataValue()][stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5];
                        }
                    }
                }
            }
        }
        return ItemInteractionResult.sidedSuccess(level.isClientSide());
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> blockEntityType) {
        if (level.isClientSide()) return null;
        return createTickerHelper(blockEntityType, NRRBlockEntities.MANUFACTORY_BLOCK_ENTITY.get(),
                (_level, blockPos, blockState, blockEntity) -> blockEntity.tick(_level, blockPos, blockState));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
        builder.add(FACING, WORKING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(WORKING, false);
    }

    @Override
    protected @NotNull BlockState rotate(@NotNull BlockState state, @NotNull Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    protected @NotNull BlockState mirror(@NotNull BlockState state, @NotNull Mirror mirror) {
        return state.setValue(FACING, mirror.mirror(state.getValue(FACING)));
    }
}
