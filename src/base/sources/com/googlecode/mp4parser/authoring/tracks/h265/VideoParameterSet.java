package com.googlecode.mp4parser.authoring.tracks.h265;

import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class VideoParameterSet {
    ByteBuffer vps;
    int vps_parameter_set_id;

    public VideoParameterSet(ByteBuffer byteBuffer) {
        this.vps = byteBuffer;
        CAVLCReader cAVLCReader = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer) byteBuffer.position(0))));
        this.vps_parameter_set_id = cAVLCReader.readU(4, "vps_parameter_set_id");
        cAVLCReader.readU(2, "vps_reserved_three_2bits");
        cAVLCReader.readU(6, "vps_max_layers_minus1");
        int u10 = cAVLCReader.readU(3, "vps_max_sub_layers_minus1");
        cAVLCReader.readBool("vps_temporal_id_nesting_flag");
        cAVLCReader.readU(16, "vps_reserved_0xffff_16bits");
        profile_tier_level(u10, cAVLCReader);
        boolean bool = cAVLCReader.readBool("vps_sub_layer_ordering_info_present_flag");
        int[] iArr = new int[bool ? 1 : u10 + 1];
        int[] iArr2 = new int[bool ? 1 : u10 + 1];
        int[] iArr3 = new int[bool ? 1 : u10 + 1];
        for (int i10 = bool ? 0 : u10; i10 <= u10; i10++) {
            iArr[i10] = cAVLCReader.readUE("vps_max_dec_pic_buffering_minus1[" + i10 + "]");
            iArr2[i10] = cAVLCReader.readUE("vps_max_dec_pic_buffering_minus1[" + i10 + "]");
            iArr3[i10] = cAVLCReader.readUE("vps_max_dec_pic_buffering_minus1[" + i10 + "]");
        }
        int u11 = cAVLCReader.readU(6, "vps_max_layer_id");
        int ue2 = cAVLCReader.readUE("vps_num_layer_sets_minus1");
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, ue2, u11);
        for (int i11 = 1; i11 <= ue2; i11++) {
            for (int i12 = 0; i12 <= u11; i12++) {
                zArr[i11][i12] = cAVLCReader.readBool("layer_id_included_flag[" + i11 + "][" + i12 + "]");
            }
        }
        if (cAVLCReader.readBool("vps_timing_info_present_flag")) {
            cAVLCReader.readU(32, "vps_num_units_in_tick");
            cAVLCReader.readU(32, "vps_time_scale");
            if (cAVLCReader.readBool("vps_poc_proportional_to_timing_flag")) {
                cAVLCReader.readUE("vps_num_ticks_poc_diff_one_minus1");
            }
            int ue3 = cAVLCReader.readUE("vps_num_hrd_parameters");
            int[] iArr4 = new int[ue3];
            boolean[] zArr2 = new boolean[ue3];
            for (int i13 = 0; i13 < ue3; i13++) {
                iArr4[i13] = cAVLCReader.readUE("hrd_layer_set_idx[" + i13 + "]");
                if (i13 > 0) {
                    zArr2[i13] = cAVLCReader.readBool("cprms_present_flag[" + i13 + "]");
                } else {
                    zArr2[0] = true;
                }
                hrd_parameters(zArr2[i13], u10, cAVLCReader);
            }
        }
        if (cAVLCReader.readBool("vps_extension_flag")) {
            while (cAVLCReader.moreRBSPData()) {
                cAVLCReader.readBool("vps_extension_data_flag");
            }
        }
        cAVLCReader.readTrailingBits();
    }

    private void hrd_parameters(boolean z10, int i10, CAVLCReader cAVLCReader) {
        boolean bool;
        boolean bool2;
        boolean bool3;
        if (z10) {
            bool = cAVLCReader.readBool("nal_hrd_parameters_present_flag");
            bool2 = cAVLCReader.readBool("vcl_hrd_parameters_present_flag");
            if (bool || bool2) {
                bool3 = cAVLCReader.readBool("sub_pic_hrd_params_present_flag");
                if (bool3) {
                    cAVLCReader.readU(8, "tick_divisor_minus2");
                    cAVLCReader.readU(5, "du_cpb_removal_delay_increment_length_minus1");
                    cAVLCReader.readBool("sub_pic_cpb_params_in_pic_timing_sei_flag");
                    cAVLCReader.readU(5, "dpb_output_delay_du_length_minus1");
                }
                cAVLCReader.readU(4, "bit_rate_scale");
                cAVLCReader.readU(4, "cpb_size_scale");
                if (bool3) {
                    cAVLCReader.readU(4, "cpb_size_du_scale");
                }
                cAVLCReader.readU(5, "initial_cpb_removal_delay_length_minus1");
                cAVLCReader.readU(5, "au_cpb_removal_delay_length_minus1");
                cAVLCReader.readU(5, "dpb_output_delay_length_minus1");
            } else {
                bool3 = false;
            }
        } else {
            bool = false;
            bool2 = false;
            bool3 = false;
        }
        boolean[] zArr = new boolean[i10];
        boolean[] zArr2 = new boolean[i10];
        boolean[] zArr3 = new boolean[i10];
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 <= i10; i11++) {
            boolean bool4 = cAVLCReader.readBool("fixed_pic_rate_general_flag[" + i11 + "]");
            zArr[i11] = bool4;
            if (!bool4) {
                zArr2[i11] = cAVLCReader.readBool("fixed_pic_rate_within_cvs_flag[" + i11 + "]");
            }
            if (zArr2[i11]) {
                iArr2[i11] = cAVLCReader.readUE("elemental_duration_in_tc_minus1[" + i11 + "]");
            } else {
                zArr3[i11] = cAVLCReader.readBool("low_delay_hrd_flag[" + i11 + "]");
            }
            if (!zArr3[i11]) {
                iArr[i11] = cAVLCReader.readUE("cpb_cnt_minus1[" + i11 + "]");
            }
            if (bool) {
                sub_layer_hrd_parameters(i11, iArr[i11], bool3, cAVLCReader);
            }
            if (bool2) {
                sub_layer_hrd_parameters(i11, iArr[i11], bool3, cAVLCReader);
            }
        }
    }

    public void profile_tier_level(int i10, CAVLCReader cAVLCReader) {
        int i11 = 2;
        cAVLCReader.readU(2, "general_profile_space ");
        cAVLCReader.readBool("general_tier_flag");
        cAVLCReader.readU(5, "general_profile_idc");
        int i12 = 32;
        boolean[] zArr = new boolean[32];
        int i13 = 0;
        int i14 = 0;
        while (i14 < i12) {
            zArr[i14] = cAVLCReader.readBool("general_profile_compatibility_flag[" + i14 + "]");
            i14++;
            i12 = 32;
            i11 = 2;
            i13 = 0;
        }
        cAVLCReader.readBool("general_progressive_source_flag");
        cAVLCReader.readBool("general_interlaced_source_flag");
        cAVLCReader.readBool("general_non_packed_constraint_flag");
        cAVLCReader.readBool("general_frame_only_constraint_flag");
        cAVLCReader.readU(44, "general_reserved_zero_44bits");
        cAVLCReader.readU(8, "general_level_idc");
        boolean[] zArr2 = new boolean[i10];
        boolean[] zArr3 = new boolean[i10];
        int i15 = i13;
        while (i15 < i10) {
            zArr2[i15] = cAVLCReader.readBool("sub_layer_profile_present_flag[" + i15 + "]");
            zArr3[i15] = cAVLCReader.readBool("sub_layer_level_present_flag[" + i15 + "]");
            i15++;
            i10 = i10;
            i12 = 32;
            i11 = 2;
            i13 = 0;
        }
        if (i10 > 0) {
            for (int i16 = i10; i16 < 8; i16++) {
                cAVLCReader.readU(i11, "reserved_zero_2bits");
            }
        }
        int[] iArr = new int[i10];
        boolean[] zArr4 = new boolean[i10];
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i11];
        iArr3[1] = i12;
        iArr3[i13] = i10;
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iArr3);
        boolean[] zArr6 = new boolean[i10];
        boolean[] zArr7 = new boolean[i10];
        boolean[] zArr8 = new boolean[i10];
        boolean[] zArr9 = new boolean[i10];
        int[] iArr4 = new int[i10];
        int i17 = 0;
        while (i17 < i10) {
            if (zArr2[i17]) {
                iArr[i17] = cAVLCReader.readU(2, "sub_layer_profile_space[" + i17 + "]");
                zArr4[i17] = cAVLCReader.readBool("sub_layer_tier_flag[" + i17 + "]");
                iArr2[i17] = cAVLCReader.readU(5, "sub_layer_profile_idc[" + i17 + "]");
                int i18 = 0;
                while (i18 < 32) {
                    zArr5[i17][i18] = cAVLCReader.readBool("sub_layer_profile_compatibility_flag[" + i17 + "][" + i18 + "]");
                    i18++;
                    iArr4 = iArr4;
                }
                zArr6[i17] = cAVLCReader.readBool("sub_layer_progressive_source_flag[" + i17 + "]");
                zArr7[i17] = cAVLCReader.readBool("sub_layer_interlaced_source_flag[" + i17 + "]");
                zArr8[i17] = cAVLCReader.readBool("sub_layer_non_packed_constraint_flag[" + i17 + "]");
                zArr9[i17] = cAVLCReader.readBool("sub_layer_frame_only_constraint_flag[" + i17 + "]");
                cAVLCReader.readNBit(44, "reserved");
            }
            int[] iArr5 = iArr4;
            if (zArr3[i17]) {
                iArr5[i17] = cAVLCReader.readU(8, "sub_layer_level_idc");
            }
            i17++;
            i10 = i10;
            iArr4 = iArr5;
        }
    }

    void sub_layer_hrd_parameters(int i10, int i11, boolean z10, CAVLCReader cAVLCReader) {
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int[] iArr4 = new int[i11];
        boolean[] zArr = new boolean[i11];
        for (int i12 = 0; i12 <= i11; i12++) {
            iArr[i12] = cAVLCReader.readUE("bit_rate_value_minus1[" + i12 + "]");
            iArr2[i12] = cAVLCReader.readUE("cpb_size_value_minus1[" + i12 + "]");
            if (z10) {
                iArr3[i12] = cAVLCReader.readUE("cpb_size_du_value_minus1[" + i12 + "]");
                iArr4[i12] = cAVLCReader.readUE("bit_rate_du_value_minus1[" + i12 + "]");
            }
            zArr[i12] = cAVLCReader.readBool("cbr_flag[" + i12 + "]");
        }
    }

    public ByteBuffer toByteBuffer() {
        return this.vps;
    }
}
