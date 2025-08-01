package com.fnwd.nrreborn.util;

import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandlerModifiable;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class WrappedHandler implements IItemHandlerModifiable {
    private final IItemHandlerModifiable handler;
    private final Predicate<Integer> extract;
    private final BiPredicate<Integer, ItemStack> insert;

    public WrappedHandler(IItemHandlerModifiable handler, Predicate<Integer> extract, BiPredicate<Integer, ItemStack> insert) {
        this.handler = handler;
        this.extract = extract;
        this.insert = insert;
    }

    @Override
    public void setStackInSlot(int i, ItemStack itemStack) {
        handler.setStackInSlot(i, itemStack);
    }

    @Override
    public int getSlots() {
        return handler.getSlots();
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return handler.getStackInSlot(i);
    }

    @Override
    public ItemStack insertItem(int i, ItemStack itemStack, boolean b) {
        return insert.test(i, itemStack) ? handler.insertItem(i, itemStack, b) : itemStack;
    }

    @Override
    public ItemStack extractItem(int i, int i1, boolean b) {
        return extract.test(i) ? handler.extractItem(i, i1, b) : ItemStack.EMPTY;
    }

    @Override
    public int getSlotLimit(int i) {
        return handler.getSlotLimit(i);
    }

    @Override
    public boolean isItemValid(int i, ItemStack itemStack) {
        return insert.test(i, itemStack) && handler.isItemValid(i, itemStack);
    }
}
