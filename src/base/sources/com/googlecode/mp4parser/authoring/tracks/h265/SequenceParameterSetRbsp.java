package com.googlecode.mp4parser.authoring.tracks.h265;

import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import java.io.InputStream;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SequenceParameterSetRbsp {
    private void profile_tier_level(int i10, CAVLCReader cAVLCReader) {
        long[] jArr;
        int i11 = 2;
        cAVLCReader.readU(2, "general_profile_space");
        cAVLCReader.readBool("general_tier_flag");
        cAVLCReader.readU(5, "general_profile_idc");
        int i12 = 32;
        boolean[] zArr = new boolean[32];
        int i13 = 0;
        int i14 = 0;
        while (i14 < i12) {
            zArr[i14] = cAVLCReader.readBool();
            i14++;
            i12 = 32;
            i11 = 2;
            i13 = 0;
        }
        cAVLCReader.readBool("general_progressive_source_flag");
        cAVLCReader.readBool("general_interlaced_source_flag");
        cAVLCReader.readBool("general_non_packed_constraint_flag");
        cAVLCReader.readBool("general_frame_only_constraint_flag");
        cAVLCReader.readNBit(44, "general_reserved_zero_44bits");
        cAVLCReader.readByte();
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
            int[] iArr = new int[8];
            for (int i16 = i10; i16 < 8; i16++) {
                iArr[i16] = cAVLCReader.readU(i11, "reserved_zero_2bits[" + i16 + "]");
            }
        }
        int[] iArr2 = new int[i10];
        boolean[] zArr4 = new boolean[i10];
        int[] iArr3 = new int[i10];
        int[] iArr4 = new int[i11];
        iArr4[1] = i12;
        iArr4[i13] = i10;
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iArr4);
        boolean[] zArr6 = new boolean[i10];
        boolean[] zArr7 = new boolean[i10];
        boolean[] zArr8 = new boolean[i10];
        boolean[] zArr9 = new boolean[i10];
        long[] jArr2 = new long[i10];
        int[] iArr5 = new int[i10];
        int i17 = 0;
        while (i17 < i10) {
            if (zArr2[i17]) {
                jArr = jArr2;
                iArr2[i17] = cAVLCReader.readU(2, "sub_layer_profile_space[" + i17 + "]");
                zArr4[i17] = cAVLCReader.readBool("sub_layer_tier_flag[" + i17 + "]");
                iArr3[i17] = cAVLCReader.readU(5, "sub_layer_profile_idc[" + i17 + "]");
                int i18 = 0;
                while (i18 < 32) {
                    zArr5[i17][i18] = cAVLCReader.readBool("sub_layer_profile_compatibility_flag[" + i17 + "][" + i18 + "]");
                    i18++;
                    iArr5 = iArr5;
                }
                zArr6[i17] = cAVLCReader.readBool("sub_layer_progressive_source_flag[" + i17 + "]");
                zArr7[i17] = cAVLCReader.readBool("sub_layer_interlaced_source_flag[" + i17 + "]");
                zArr8[i17] = cAVLCReader.readBool("sub_layer_non_packed_constraint_flag[" + i17 + "]");
                zArr9[i17] = cAVLCReader.readBool("sub_layer_frame_only_constraint_flag[" + i17 + "]");
                jArr[i17] = cAVLCReader.readNBit(44);
            } else {
                jArr = jArr2;
            }
            int[] iArr6 = iArr5;
            if (zArr3[i17]) {
                iArr6[i17] = cAVLCReader.readU(8, "sub_layer_level_idc[" + i17 + "]");
            }
            i17++;
            i10 = i10;
            jArr2 = jArr;
            iArr5 = iArr6;
        }
    }

    private void scaling_list_data(CAVLCReader cAVLCReader) {
        int i10 = 4;
        boolean[][] zArr = new boolean[4][];
        int[][] iArr = new int[4][];
        int[][] iArr2 = new int[2][];
        int[][][] iArr3 = new int[4][][];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = 0;
            while (true) {
                if (i12 >= (i11 == 3 ? 2 : 6)) {
                    break;
                }
                zArr[i11] = new boolean[i11 == 3 ? 2 : 6];
                iArr[i11] = new int[i11 == 3 ? 2 : 6];
                iArr3[i11] = new int[i11 == 3 ? 2 : 6][];
                zArr[i11][i12] = cAVLCReader.readBool();
                if (zArr[i11][i12]) {
                    int iMin = Math.min(64, 1 << ((i11 << 1) + i10));
                    int se2 = 8;
                    if (i11 > 1) {
                        int i13 = i11 - 2;
                        iArr2[i13][i12] = cAVLCReader.readSE("scaling_list_dc_coef_minus8[" + i11 + "- 2][" + i12 + "]");
                        se2 = 8 + iArr2[i13][i12];
                    }
                    iArr3[i11][i12] = new int[iMin];
                    for (int i14 = 0; i14 < iMin; i14++) {
                        se2 = ((se2 + cAVLCReader.readSE("scaling_list_delta_coef ")) + 256) % 256;
                        iArr3[i11][i12][i14] = se2;
                    }
                } else {
                    iArr[i11][i12] = cAVLCReader.readUE("scaling_list_pred_matrix_id_delta[" + i11 + "][" + i12 + "]");
                }
                i12++;
                i10 = 4;
            }
            i11++;
        }
    }

    public SequenceParameterSetRbsp(InputStream inputStream) {
        int i10;
        CAVLCReader cAVLCReader = new CAVLCReader(inputStream);
        cAVLCReader.readNBit(4, "sps_video_parameter_set_id");
        int nBit = (int) cAVLCReader.readNBit(3, "sps_max_sub_layers_minus1");
        cAVLCReader.readBool("sps_temporal_id_nesting_flag");
        profile_tier_level(nBit, cAVLCReader);
        cAVLCReader.readUE("sps_seq_parameter_set_id");
        if (cAVLCReader.readUE("chroma_format_idc") == 3) {
            cAVLCReader.read1Bit();
            cAVLCReader.readUE("pic_width_in_luma_samples");
            cAVLCReader.readUE("pic_width_in_luma_samples");
            if (cAVLCReader.readBool("conformance_window_flag")) {
                cAVLCReader.readUE("conf_win_left_offset");
                cAVLCReader.readUE("conf_win_right_offset");
                cAVLCReader.readUE("conf_win_top_offset");
                cAVLCReader.readUE("conf_win_bottom_offset");
            }
        }
        cAVLCReader.readUE("bit_depth_luma_minus8");
        cAVLCReader.readUE("bit_depth_chroma_minus8");
        cAVLCReader.readUE("log2_max_pic_order_cnt_lsb_minus4");
        boolean bool = cAVLCReader.readBool("sps_sub_layer_ordering_info_present_flag");
        if (bool) {
            i10 = 0;
        } else {
            i10 = nBit;
        }
        int i11 = (nBit - i10) + 1;
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        for (int i12 = bool ? 0 : nBit; i12 <= nBit; i12++) {
            iArr[i12] = cAVLCReader.readUE("sps_max_dec_pic_buffering_minus1[" + i12 + "]");
            iArr2[i12] = cAVLCReader.readUE("sps_max_num_reorder_pics[" + i12 + "]");
            iArr3[i12] = cAVLCReader.readUE("sps_max_latency_increase_plus1[" + i12 + "]");
        }
        cAVLCReader.readUE("log2_min_luma_coding_block_size_minus3");
        cAVLCReader.readUE("log2_diff_max_min_luma_coding_block_size");
        cAVLCReader.readUE("log2_min_transform_block_size_minus2");
        cAVLCReader.readUE("log2_diff_max_min_transform_block_size");
        cAVLCReader.readUE("max_transform_hierarchy_depth_inter");
        cAVLCReader.readUE("max_transform_hierarchy_depth_intra");
        if (cAVLCReader.readBool("scaling_list_enabled_flag") && cAVLCReader.readBool("sps_scaling_list_data_present_flag")) {
            scaling_list_data(cAVLCReader);
        }
        cAVLCReader.readBool("amp_enabled_flag");
        cAVLCReader.readBool("sample_adaptive_offset_enabled_flag");
        if (cAVLCReader.readBool(IAoPeRfJn.AmrFFkQypHLg)) {
            cAVLCReader.readNBit(4, "pcm_sample_bit_depth_luma_minus1");
            cAVLCReader.readNBit(4, "pcm_sample_bit_depth_chroma_minus1");
            cAVLCReader.readUE("log2_min_pcm_luma_coding_block_size_minus3");
        }
    }
}
