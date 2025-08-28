package com.fnwd.nrreborn;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class NRRConfig {
    static {
        Pair<NRRConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(NRRConfig::new);
        SPEC = pair.getRight();
        CONFIG = pair.getLeft();
    }

    public static final ModConfigSpec SPEC;
    public static final NRRConfig CONFIG;

    public final ModConfigSpec.DoubleValue TBU_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEU_233_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEU_235_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEN_236_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEP_239_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEP_241_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue MOX_239_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue MOX_241_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEA_242_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_243_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_245_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_247_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEB_248_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECF_249_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECF_251_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEU_233_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEU_235_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEN_236_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEP_239_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEP_241_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEA_242_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_243_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_245_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_247_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEB_248_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECF_249_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECF_251_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue TBU_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEU_233_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEU_235_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEN_236_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEP_239_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEP_241_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue MOX_239_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue MOX_241_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEA_242_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_243_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_245_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_247_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEB_248_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECF_249_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECF_251_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEU_233_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEU_235_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEN_236_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEP_239_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEP_241_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEA_242_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_243_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_245_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_247_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEB_248_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECF_249_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECF_251_OXIDE_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue TBU_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEU_233_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEU_235_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEN_236_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEP_239_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEP_241_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue MOX_239_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue MOX_241_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEA_242_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_243_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_245_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECM_247_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LEB_248_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECF_249_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue LECF_251_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEU_233_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEU_235_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEN_236_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEP_239_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEP_241_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEA_242_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_243_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_245_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECM_247_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HEB_248_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECF_249_TRISO_GENERATION_RATE;
    public final ModConfigSpec.DoubleValue HECF_251_TRISO_GENERATION_RATE;

    private NRRConfig(ModConfigSpec.Builder builder) {
        builder.comment("NRR Config").push("fission_fuel_generation_rates");
        TBU_GENERATION_RATE = builder
                .comment("TBU Fuel Generation Rate")
                .defineInRange("tbu_generation_rate", 960.0D, 0.0D, 16777216.0D);
        LEU_233_GENERATION_RATE = builder
                .comment("LEU-233 Fuel Generation Rate")
                .defineInRange("leu_233_generation_rate", 2304.0D, 0.0D, 16777216.0D);
        LEU_235_GENERATION_RATE = builder
                .comment("LEU-235 Fuel Generation Rate")
                .defineInRange("leu_235_generation_rate", 1920.0D, 0.0D, 16777216.0D);
        LEN_236_GENERATION_RATE = builder
                .comment("LEN-236 Fuel Generation Rate")
                .defineInRange("len_236_generation_rate", 1440.0D, 0.0D, 16777216.0D);
        LEP_239_GENERATION_RATE = builder
                .comment("LEP-239 Fuel Generation Rate")
                .defineInRange("lep_239_generation_rate", 1680.0D, 0.0D, 16777216.0D);
        LEP_241_GENERATION_RATE = builder
                .comment("LEP-241 Fuel Generation Rate")
                .defineInRange("lep_241_generation_rate", 2640.0D, 0.0D, 16777216.0D);
        MOX_239_GENERATION_RATE = builder
                .comment("MOX-239 Fuel Generation Rate")
                .defineInRange("mox_239_generation_rate", 2486.4D, 0.0D, 16777216.0D);
        MOX_241_GENERATION_RATE = builder
                .comment("MOX-241 Fuel Generation Rate")
                .defineInRange("mox_241_generation_rate", 3897.6D, 0.0D, 16777216.0D);
        LEA_242_GENERATION_RATE = builder
                .comment("LEA-242 Fuel Generation Rate")
                .defineInRange("lea_242_generation_rate", 3072.0D, 0.0D, 16777216.0D);
        LECM_243_GENERATION_RATE = builder
                .comment("LECm-243 Fuel Generation Rate")
                .defineInRange("lecm_243_generation_rate", 3360.0D, 0.0D, 16777216.0D);
        LECM_245_GENERATION_RATE = builder
                .comment("LECm-245 Fuel Generation Rate")
                .defineInRange("lecm_245_generation_rate", 2592.0D, 0.0D, 16777216.0D);
        LECM_247_GENERATION_RATE = builder
                .comment("LECm-247 Fuel Generation Rate")
                .defineInRange("lecm_247_generation_rate", 2208.0D, 0.0D, 16777216.0D);
        LEB_248_GENERATION_RATE = builder
                .comment("LEB-248 Fuel Generation Rate")
                .defineInRange("leb_248_generation_rate", 2160.0D, 0.0D, 16777216.0D);
        LECF_249_GENERATION_RATE = builder
                .comment("LECf-249 Fuel Generation Rate")
                .defineInRange("lecf_249_generation_rate", 3456.0D, 0.0D, 16777216.0D);
        LECF_251_GENERATION_RATE = builder
                .comment("LECf-251 Fuel Generation Rate")
                .defineInRange("lecf_251_generation_rate", 3600.0D, 0.0D, 16777216.0D);
        HEU_233_GENERATION_RATE = builder
                .comment("HEU-233 Fuel Generation Rate")
                .defineInRange("heu_233_generation_rate", 9216.0D, 0.0D, 16777216.0D);
        HEU_235_GENERATION_RATE = builder
                .comment("HEU-235 Fuel Generation Rate")
                .defineInRange("heu_235_generation_rate", 7680.0D, 0.0D, 16777216.0D);
        HEN_236_GENERATION_RATE = builder
                .comment("HEN-236 Fuel Generation Rate")
                .defineInRange("hen_236_generation_rate", 5760.0D, 0.0D, 16777216.0D);
        HEP_239_GENERATION_RATE = builder
                .comment("HEP-239 Fuel Generation Rate")
                .defineInRange("hep_239_generation_rate", 6720.0D, 0.0D, 16777216.0D);
        HEP_241_GENERATION_RATE = builder
                .comment("HEP-241 Fuel Generation Rate")
                .defineInRange("hep_241_generation_rate", 10560.0D, 0.0D, 16777216.0D);
        HEA_242_GENERATION_RATE = builder
                .comment("HEA-242 Fuel Generation Rate")
                .defineInRange("hea_242_generation_rate", 12288.0D, 0.0D, 16777216.0D);
        HECM_243_GENERATION_RATE = builder
                .comment("HECm-243 Fuel Generation Rate")
                .defineInRange("hecm_243_generation_rate", 13440.0D, 0.0D, 16777216.0D);
        HECM_245_GENERATION_RATE = builder
                .comment("HECm-245 Fuel Generation Rate")
                .defineInRange("hecm_245_generation_rate", 10368.0D, 0.0D, 16777216.0D);
        HECM_247_GENERATION_RATE = builder
                .comment("HECm-247 Fuel Generation Rate")
                .defineInRange("hecm_247_generation_rate", 8832.0D, 0.0D, 16777216.0D);
        HEB_248_GENERATION_RATE = builder
                .comment("HEB-248 Fuel Generation Rate")
                .defineInRange("heb_248_generation_rate", 8640.0D, 0.0D, 16777216.0D);
        HECF_249_GENERATION_RATE = builder
                .comment("HECf-249 Fuel Generation Rate")
                .defineInRange("hecf_249_generation_rate", 13824.0D, 0.0D, 16777216.0D);
        HECF_251_GENERATION_RATE = builder
                .comment("HECf-251 Fuel Generation Rate")
                .defineInRange("hecf_251_generation_rate", 14400.0D, 0.0D, 16777216.0D);
        TBU_OXIDE_GENERATION_RATE = builder
                .comment("TBU Oxide Fuel Generation Rate")
                .defineInRange("tbu_oxide_generation_rate", 1344.0D, 0.0D, 16777216.0D);
        LEU_233_OXIDE_GENERATION_RATE = builder
                .comment("LEU-233 Oxide Fuel Generation Rate")
                .defineInRange("leu_233_oxide_generation_rate", 3225.6D, 0.0D, 16777216.0D);
        LEU_235_OXIDE_GENERATION_RATE = builder
                .comment("LEU-235 Oxide Fuel Generation Rate")
                .defineInRange("leu_235_oxide_generation_rate", 2688.0D, 0.0D, 16777216.0D);
        LEN_236_OXIDE_GENERATION_RATE = builder
                .comment("LEN-236 Oxide Fuel Generation Rate")
                .defineInRange("len_236_oxide_generation_rate", 2016.0D, 0.0D, 16777216.0D);
        LEP_239_OXIDE_GENERATION_RATE = builder
                .comment("LEP-239 Oxide Fuel Generation Rate")
                .defineInRange("lep_239_oxide_generation_rate", 2352.0D, 0.0D, 16777216.0D);
        LEP_241_OXIDE_GENERATION_RATE = builder
                .comment("LEP-241 Oxide Fuel Generation Rate")
                .defineInRange("lep_241_oxide_generation_rate", 3696.0D, 0.0D, 16777216.0D);
        MOX_239_OXIDE_GENERATION_RATE = builder
                .comment("MOX-239 Oxide Fuel Generation Rate")
                .defineInRange("mox_239_oxide_generation_rate", 3481.6D, 0.0D, 16777216.0D);
        MOX_241_OXIDE_GENERATION_RATE = builder
                .comment("MOX-241 Oxide Fuel Generation Rate")
                .defineInRange("mox_241_oxide_generation_rate", 5456.0D, 0.0D, 16777216.0D);
        LEA_242_OXIDE_GENERATION_RATE = builder
                .comment("LEA-242 Oxide Fuel Generation Rate")
                .defineInRange("lea_242_oxide_generation_rate", 4300.8D, 0.0D, 16777216.0D);
        LECM_243_OXIDE_GENERATION_RATE = builder
                .comment("LECm-243 Oxide Fuel Generation Rate")
                .defineInRange("lecm_243_oxide_generation_rate", 4704.0D, 0.0D, 16777216.0D);
        LECM_245_OXIDE_GENERATION_RATE = builder
                .comment("LECm-245 Oxide Fuel Generation Rate")
                .defineInRange("lecm_245_oxide_generation_rate", 3628.8D, 0.0D, 16777216.0D);
        LECM_247_OXIDE_GENERATION_RATE = builder
                .comment("LECm-247 Oxide Fuel Generation Rate")
                .defineInRange("lecm_247_oxide_generation_rate", 3091.2D, 0.0D, 16777216.0D);
        LEB_248_OXIDE_GENERATION_RATE = builder
                .comment("LEB-248 Oxide Fuel Generation Rate")
                .defineInRange("leb_248_oxide_generation_rate", 3024.0D, 0.0D, 16777216.0D);
        LECF_249_OXIDE_GENERATION_RATE = builder
                .comment("LECf-249 Oxide Fuel Generation Rate")
                .defineInRange("lecf_249_oxide_generation_rate", 4838.4D, 0.0D, 16777216.0D);
        LECF_251_OXIDE_GENERATION_RATE = builder
                .comment("LECf-251 Oxide Fuel Generation Rate")
                .defineInRange("lecf_251_oxide_generation_rate", 5040.0D, 0.0D, 16777216.0D);
        HEU_233_OXIDE_GENERATION_RATE = builder
                .comment("HEU-233 Oxide Fuel Generation Rate")
                .defineInRange("heu_233_oxide_generation_rate", 12902.4D, 0.0D, 16777216.0D);
        HEU_235_OXIDE_GENERATION_RATE = builder
                .comment("HEU-235 Oxide Fuel Generation Rate")
                .defineInRange("heu_235_oxide_generation_rate", 10752.0D, 0.0D, 16777216.0D);
        HEN_236_OXIDE_GENERATION_RATE = builder
                .comment("HEN-236 Oxide Fuel Generation Rate")
                .defineInRange("hen_236_oxide_generation_rate", 8064.0D, 0.0D, 16777216.0D);
        HEP_239_OXIDE_GENERATION_RATE = builder
                .comment("HEP-239 Oxide Fuel Generation Rate")
                .defineInRange("hep_239_oxide_generation_rate", 9408.0D, 0.0D, 16777216.0D);
        HEP_241_OXIDE_GENERATION_RATE = builder
                .comment("HEP-241 Oxide Fuel Generation Rate")
                .defineInRange("hep_241_oxide_generation_rate", 14784.0D, 0.0D, 16777216.0D);
        HEA_242_OXIDE_GENERATION_RATE = builder
                .comment("HEA-242 Oxide Fuel Generation Rate")
                .defineInRange("hea_242_oxide_generation_rate", 17203.2D, 0.0D, 16777216.0D);
        HECM_243_OXIDE_GENERATION_RATE = builder
                .comment("HECm-243 Oxide Fuel Generation Rate")
                .defineInRange("hecm_243_oxide_generation_rate", 18816.0D, 0.0D, 16777216.0D);
        HECM_245_OXIDE_GENERATION_RATE = builder
                .comment("HECm-245 Oxide Fuel Generation Rate")
                .defineInRange("hecm_245_oxide_generation_rate", 14515.2D, 0.0D, 16777216.0D);
        HECM_247_OXIDE_GENERATION_RATE = builder
                .comment("HECm-247 Oxide Fuel Generation Rate")
                .defineInRange("hecm_247_oxide_generation_rate", 12364.8D, 0.0D, 16777216.0D);
        HEB_248_OXIDE_GENERATION_RATE = builder
                .comment("HEB-248 Oxide Fuel Generation Rate")
                .defineInRange("heb_248_oxide_generation_rate", 12096.0D, 0.0D, 16777216.0D);
        HECF_249_OXIDE_GENERATION_RATE = builder
                .comment("HECf-249 Oxide Fuel Generation Rate")
                .defineInRange("hecf_249_oxide_generation_rate", 19353.6D, 0.0D, 16777216.0D);
        HECF_251_OXIDE_GENERATION_RATE = builder
                .comment("HECf-251 Oxide Fuel Generation Rate")
                .defineInRange("hecf_251_oxide_generation_rate", 20160.0D, 0.0D, 16777216.0D);
        TBU_TRISO_GENERATION_RATE = builder
                .comment("TBU TRISO Fuel Generation Rate")
                .defineInRange("tbu_triso_generation_rate", 768.0D, 0.0D, 16777216.0D);
        LEU_233_TRISO_GENERATION_RATE = builder
                .comment("LEU-233 TRISO Fuel Generation Rate")
                .defineInRange("leu_233_triso_generation_rate", 1843.2D, 0.0D, 16777216.0D);
        LEU_235_TRISO_GENERATION_RATE = builder
                .comment("LEU-235 TRISO Fuel Generation Rate")
                .defineInRange("leu_235_triso_generation_rate", 1536.0D, 0.0D, 16777216.0D);
        LEN_236_TRISO_GENERATION_RATE = builder
                .comment("LEN-236 TRISO Fuel Generation Rate")
                .defineInRange("len_236_triso_generation_rate", 1152.0D, 0.0D, 16777216.0D);
        LEP_239_TRISO_GENERATION_RATE = builder
                .comment("LEP-239 TRISO Fuel Generation Rate")
                .defineInRange("lep_239_triso_generation_rate", 1344.0D, 0.0D, 16777216.0D);
        LEP_241_TRISO_GENERATION_RATE = builder
                .comment("LEP-241 TRISO Fuel Generation Rate")
                .defineInRange("lep_241_triso_generation_rate", 2112.0D, 0.0D, 16777216.0D);
        MOX_239_TRISO_GENERATION_RATE = builder
                .comment("MOX-239 TRISO Fuel Generation Rate")
                .defineInRange("mox_239_triso_generation_rate", 1988.8D, 0.0D, 16777216.0D);
        MOX_241_TRISO_GENERATION_RATE = builder
                .comment("MOX-241 TRISO Fuel Generation Rate")
                .defineInRange("mox_241_triso_generation_rate", 3118.4D, 0.0D, 16777216.0D);
        LEA_242_TRISO_GENERATION_RATE = builder
                .comment("LEA-242 TRISO Fuel Generation Rate")
                .defineInRange("lea_242_triso_generation_rate", 2457.6D, 0.0D, 16777216.0D);
        LECM_243_TRISO_GENERATION_RATE = builder
                .comment("LECm-243 TRISO Fuel Generation Rate")
                .defineInRange("lecm_243_triso_generation_rate", 2688.0D, 0.0D, 16777216.0D);
        LECM_245_TRISO_GENERATION_RATE = builder
                .comment("LECm-245 TRISO Fuel Generation Rate")
                .defineInRange("lecm_245_triso_generation_rate", 2073.6D, 0.0D, 16777216.0D);
        LECM_247_TRISO_GENERATION_RATE = builder
                .comment("LECm-247 TRISO Fuel Generation Rate")
                .defineInRange("lecm_247_triso_generation_rate", 1766.4D, 0.0D, 16777216.0D);
        LEB_248_TRISO_GENERATION_RATE = builder
                .comment("LEB-248 TRISO Fuel Generation Rate")
                .defineInRange("leb_248_triso_generation_rate", 1728.0D, 0.0D, 16777216.0D);
        LECF_249_TRISO_GENERATION_RATE = builder
                .comment("LECf-249 TRISO Fuel Generation Rate")
                .defineInRange("lecf_249_triso_generation_rate", 2764.8D, 0.0D, 16777216.0D);
        LECF_251_TRISO_GENERATION_RATE = builder
                .comment("LECf-251 TRISO Fuel Generation Rate")
                .defineInRange("lecf_251_triso_generation_rate", 2880.0D, 0.0D, 16777216.0D);
        HEU_233_TRISO_GENERATION_RATE = builder
                .comment("HEU-233 TRISO Fuel Generation Rate")
                .defineInRange("heu_233_triso_generation_rate", 7372.8D, 0.0D, 16777216.0D);
        HEU_235_TRISO_GENERATION_RATE = builder
                .comment("HEU-235 TRISO Fuel Generation Rate")
                .defineInRange("heu_235_triso_generation_rate", 6144.0D, 0.0D, 16777216.0D);
        HEN_236_TRISO_GENERATION_RATE = builder
                .comment("HEN-236 TRISO Fuel Generation Rate")
                .defineInRange("hen_236_triso_generation_rate", 4608.0D, 0.0D, 16777216.0D);
        HEP_239_TRISO_GENERATION_RATE = builder
                .comment("HEP-239 TRISO Fuel Generation Rate")
                .defineInRange("hep_239_triso_generation_rate", 5376.0D, 0.0D, 16777216.0D);
        HEP_241_TRISO_GENERATION_RATE = builder
                .comment("HEP-241 TRISO Fuel Generation Rate")
                .defineInRange("hep_241_triso_generation_rate", 8448.0D, 0.0D, 16777216.0D);
        HEA_242_TRISO_GENERATION_RATE = builder
                .comment("HEA-242 TRISO Fuel Generation Rate")
                .defineInRange("hea_242_triso_generation_rate", 9830.4D, 0.0D, 16777216.0D);
        HECM_243_TRISO_GENERATION_RATE = builder
                .comment("HECm-243 TRISO Fuel Generation Rate")
                .defineInRange("hecm_243_triso_generation_rate", 10752.0D, 0.0D, 16777216.0D);
        HECM_245_TRISO_GENERATION_RATE = builder
                .comment("HECm-245 TRISO Fuel Generation Rate")
                .defineInRange("hecm_245_triso_generation_rate", 8294.4D, 0.0D, 16777216.0D);
        HECM_247_TRISO_GENERATION_RATE = builder
                .comment("HECm-247 TRISO Fuel Generation Rate")
                .defineInRange("hecm_247_triso_generation_rate", 7065.6D, 0.0D, 16777216.0D);
        HEB_248_TRISO_GENERATION_RATE = builder
                .comment("HEB-248 TRISO Fuel Generation Rate")
                .defineInRange("heb_248_triso_generation_rate", 6912.0D, 0.0D, 16777216.0D);
        HECF_249_TRISO_GENERATION_RATE = builder
                .comment("HECf-249 TRISO Fuel Generation Rate")
                .defineInRange("hecf_249_triso_generation_rate", 11059.2D, 0.0D, 16777216.0D);
        HECF_251_TRISO_GENERATION_RATE = builder
                .comment("HECf-251 TRISO Fuel Generation Rate")
                .defineInRange("hecf_251_triso_generation_rate", 11520.0D, 0.0D, 16777216.0D);
        builder.pop();
    }
}
