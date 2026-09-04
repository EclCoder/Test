package com.googlecode.mp4parser.h264.model;

import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class PictureParameterSet extends BitstreamElement {
    public boolean bottom_field_pic_order_in_frame_present_flag;
    public int[] bottom_right;
    public int chroma_qp_index_offset;
    public boolean constrained_intra_pred_flag;
    public boolean deblocking_filter_control_present_flag;
    public boolean entropy_coding_mode_flag;
    public PPSExt extended;
    public int num_ref_idx_l0_active_minus1;
    public int num_ref_idx_l1_active_minus1;
    public int num_slice_groups_minus1;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public int pic_parameter_set_id;
    public boolean redundant_pic_cnt_present_flag;
    public int[] run_length_minus1;
    public int seq_parameter_set_id;
    public boolean slice_group_change_direction_flag;
    public int slice_group_change_rate_minus1;
    public int[] slice_group_id;
    public int slice_group_map_type;
    public int[] top_left;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class PPSExt {
        public boolean[] pic_scaling_list_present_flag;
        public ScalingMatrix scalindMatrix = new ScalingMatrix();
        public int second_chroma_qp_index_offset;
        public boolean transform_8x8_mode_flag;

        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.transform_8x8_mode_flag + ", scalindMatrix=" + this.scalindMatrix + ", second_chroma_qp_index_offset=" + this.second_chroma_qp_index_offset + ", pic_scaling_list_present_flag=" + this.pic_scaling_list_present_flag + '}';
        }
    }

    public static PictureParameterSet read(byte[] bArr) {
        return read(new ByteArrayInputStream(bArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PictureParameterSet pictureParameterSet = (PictureParameterSet) obj;
        if (!Arrays.equals(this.bottom_right, pictureParameterSet.bottom_right) || this.chroma_qp_index_offset != pictureParameterSet.chroma_qp_index_offset || this.constrained_intra_pred_flag != pictureParameterSet.constrained_intra_pred_flag || this.deblocking_filter_control_present_flag != pictureParameterSet.deblocking_filter_control_present_flag || this.entropy_coding_mode_flag != pictureParameterSet.entropy_coding_mode_flag) {
            return false;
        }
        PPSExt pPSExt = this.extended;
        if (pPSExt == null) {
            if (pictureParameterSet.extended != null) {
                return false;
            }
        } else if (!pPSExt.equals(pictureParameterSet.extended)) {
            return false;
        }
        return this.num_ref_idx_l0_active_minus1 == pictureParameterSet.num_ref_idx_l0_active_minus1 && this.num_ref_idx_l1_active_minus1 == pictureParameterSet.num_ref_idx_l1_active_minus1 && this.num_slice_groups_minus1 == pictureParameterSet.num_slice_groups_minus1 && this.pic_init_qp_minus26 == pictureParameterSet.pic_init_qp_minus26 && this.pic_init_qs_minus26 == pictureParameterSet.pic_init_qs_minus26 && this.bottom_field_pic_order_in_frame_present_flag == pictureParameterSet.bottom_field_pic_order_in_frame_present_flag && this.pic_parameter_set_id == pictureParameterSet.pic_parameter_set_id && this.redundant_pic_cnt_present_flag == pictureParameterSet.redundant_pic_cnt_present_flag && Arrays.equals(this.run_length_minus1, pictureParameterSet.run_length_minus1) && this.seq_parameter_set_id == pictureParameterSet.seq_parameter_set_id && this.slice_group_change_direction_flag == pictureParameterSet.slice_group_change_direction_flag && this.slice_group_change_rate_minus1 == pictureParameterSet.slice_group_change_rate_minus1 && Arrays.equals(this.slice_group_id, pictureParameterSet.slice_group_id) && this.slice_group_map_type == pictureParameterSet.slice_group_map_type && Arrays.equals(this.top_left, pictureParameterSet.top_left) && this.weighted_bipred_idc == pictureParameterSet.weighted_bipred_idc && this.weighted_pred_flag == pictureParameterSet.weighted_pred_flag;
    }

    public int hashCode() {
        int iHashCode = (((((((((Arrays.hashCode(this.bottom_right) + 31) * 31) + this.chroma_qp_index_offset) * 31) + (this.constrained_intra_pred_flag ? 1231 : 1237)) * 31) + (this.deblocking_filter_control_present_flag ? 1231 : 1237)) * 31) + (this.entropy_coding_mode_flag ? 1231 : 1237)) * 31;
        PPSExt pPSExt = this.extended;
        return ((((((((((((((((((((((((((((((((((iHashCode + (pPSExt == null ? 0 : pPSExt.hashCode())) * 31) + this.num_ref_idx_l0_active_minus1) * 31) + this.num_ref_idx_l1_active_minus1) * 31) + this.num_slice_groups_minus1) * 31) + this.pic_init_qp_minus26) * 31) + this.pic_init_qs_minus26) * 31) + (this.bottom_field_pic_order_in_frame_present_flag ? 1231 : 1237)) * 31) + this.pic_parameter_set_id) * 31) + (this.redundant_pic_cnt_present_flag ? 1231 : 1237)) * 31) + Arrays.hashCode(this.run_length_minus1)) * 31) + this.seq_parameter_set_id) * 31) + (this.slice_group_change_direction_flag ? 1231 : 1237)) * 31) + this.slice_group_change_rate_minus1) * 31) + Arrays.hashCode(this.slice_group_id)) * 31) + this.slice_group_map_type) * 31) + Arrays.hashCode(this.top_left)) * 31) + this.weighted_bipred_idc) * 31) + (this.weighted_pred_flag ? 1231 : 1237);
    }

    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.entropy_coding_mode_flag + ",\n       num_ref_idx_l0_active_minus1=" + this.num_ref_idx_l0_active_minus1 + ",\n       num_ref_idx_l1_active_minus1=" + this.num_ref_idx_l1_active_minus1 + ",\n       slice_group_change_rate_minus1=" + this.slice_group_change_rate_minus1 + ",\n       pic_parameter_set_id=" + this.pic_parameter_set_id + ",\n       seq_parameter_set_id=" + this.seq_parameter_set_id + ",\n       pic_order_present_flag=" + this.bottom_field_pic_order_in_frame_present_flag + ",\n       num_slice_groups_minus1=" + this.num_slice_groups_minus1 + ",\n       slice_group_map_type=" + this.slice_group_map_type + ",\n       weighted_pred_flag=" + this.weighted_pred_flag + ",\n       weighted_bipred_idc=" + this.weighted_bipred_idc + ",\n       pic_init_qp_minus26=" + this.pic_init_qp_minus26 + ",\n       pic_init_qs_minus26=" + this.pic_init_qs_minus26 + ",\n       chroma_qp_index_offset=" + this.chroma_qp_index_offset + ",\n       deblocking_filter_control_present_flag=" + this.deblocking_filter_control_present_flag + ",\n       constrained_intra_pred_flag=" + this.constrained_intra_pred_flag + ",\n       redundant_pic_cnt_present_flag=" + this.redundant_pic_cnt_present_flag + ",\n       top_left=" + this.top_left + ",\n       bottom_right=" + this.bottom_right + ",\n       run_length_minus1=" + this.run_length_minus1 + ",\n       slice_group_change_direction_flag=" + this.slice_group_change_direction_flag + ",\n       slice_group_id=" + this.slice_group_id + ",\n       extended=" + this.extended + '}';
    }

    public static PictureParameterSet read(InputStream inputStream) {
        CAVLCReader cAVLCReader = new CAVLCReader(inputStream);
        PictureParameterSet pictureParameterSet = new PictureParameterSet();
        pictureParameterSet.pic_parameter_set_id = cAVLCReader.readUE("PPS: pic_parameter_set_id");
        pictureParameterSet.seq_parameter_set_id = cAVLCReader.readUE("PPS: seq_parameter_set_id");
        pictureParameterSet.entropy_coding_mode_flag = cAVLCReader.readBool("PPS: entropy_coding_mode_flag");
        pictureParameterSet.bottom_field_pic_order_in_frame_present_flag = cAVLCReader.readBool("PPS: pic_order_present_flag");
        int ue2 = cAVLCReader.readUE("PPS: num_slice_groups_minus1");
        pictureParameterSet.num_slice_groups_minus1 = ue2;
        if (ue2 > 0) {
            int ue3 = cAVLCReader.readUE("PPS: slice_group_map_type");
            pictureParameterSet.slice_group_map_type = ue3;
            int i10 = pictureParameterSet.num_slice_groups_minus1;
            pictureParameterSet.top_left = new int[i10 + 1];
            pictureParameterSet.bottom_right = new int[i10 + 1];
            pictureParameterSet.run_length_minus1 = new int[i10 + 1];
            if (ue3 == 0) {
                for (int i11 = 0; i11 <= pictureParameterSet.num_slice_groups_minus1; i11++) {
                    pictureParameterSet.run_length_minus1[i11] = cAVLCReader.readUE("PPS: run_length_minus1");
                }
            } else if (ue3 == 2) {
                for (int i12 = 0; i12 < pictureParameterSet.num_slice_groups_minus1; i12++) {
                    pictureParameterSet.top_left[i12] = cAVLCReader.readUE("PPS: top_left");
                    pictureParameterSet.bottom_right[i12] = cAVLCReader.readUE("PPS: bottom_right");
                }
            } else {
                int i13 = 3;
                if (ue3 == 3 || ue3 == 4 || ue3 == 5) {
                    pictureParameterSet.slice_group_change_direction_flag = cAVLCReader.readBool("PPS: slice_group_change_direction_flag");
                    pictureParameterSet.slice_group_change_rate_minus1 = cAVLCReader.readUE("PPS: slice_group_change_rate_minus1");
                } else if (ue3 == 6) {
                    if (i10 + 1 <= 4) {
                        i13 = 1;
                        if (i10 + 1 > 2) {
                            i13 = 2;
                        }
                    }
                    int ue4 = cAVLCReader.readUE("PPS: pic_size_in_map_units_minus1");
                    pictureParameterSet.slice_group_id = new int[ue4 + 1];
                    for (int i14 = 0; i14 <= ue4; i14++) {
                        pictureParameterSet.slice_group_id[i14] = cAVLCReader.readU(i13, "PPS: slice_group_id [" + i14 + trPLwhKZgZ.VWShcNWkKjUU);
                    }
                }
            }
        }
        pictureParameterSet.num_ref_idx_l0_active_minus1 = cAVLCReader.readUE("PPS: num_ref_idx_l0_active_minus1");
        pictureParameterSet.num_ref_idx_l1_active_minus1 = cAVLCReader.readUE("PPS: num_ref_idx_l1_active_minus1");
        pictureParameterSet.weighted_pred_flag = cAVLCReader.readBool("PPS: weighted_pred_flag");
        pictureParameterSet.weighted_bipred_idc = (int) cAVLCReader.readNBit(2, "PPS: weighted_bipred_idc");
        pictureParameterSet.pic_init_qp_minus26 = cAVLCReader.readSE("PPS: pic_init_qp_minus26");
        pictureParameterSet.pic_init_qs_minus26 = cAVLCReader.readSE("PPS: pic_init_qs_minus26");
        pictureParameterSet.chroma_qp_index_offset = cAVLCReader.readSE("PPS: chroma_qp_index_offset");
        pictureParameterSet.deblocking_filter_control_present_flag = cAVLCReader.readBool("PPS: deblocking_filter_control_present_flag");
        pictureParameterSet.constrained_intra_pred_flag = cAVLCReader.readBool("PPS: constrained_intra_pred_flag");
        pictureParameterSet.redundant_pic_cnt_present_flag = cAVLCReader.readBool("PPS: redundant_pic_cnt_present_flag");
        if (cAVLCReader.moreRBSPData()) {
            PPSExt pPSExt = new PPSExt();
            pictureParameterSet.extended = pPSExt;
            pPSExt.transform_8x8_mode_flag = cAVLCReader.readBool("PPS: transform_8x8_mode_flag");
            if (cAVLCReader.readBool("PPS: pic_scaling_matrix_present_flag")) {
                for (int i15 = 0; i15 < ((pictureParameterSet.extended.transform_8x8_mode_flag ? 1 : 0) * 2) + 6; i15++) {
                    if (cAVLCReader.readBool("PPS: pic_scaling_list_present_flag")) {
                        ScalingMatrix scalingMatrix = pictureParameterSet.extended.scalindMatrix;
                        ScalingList[] scalingListArr = new ScalingList[8];
                        scalingMatrix.ScalingList4x4 = scalingListArr;
                        ScalingList[] scalingListArr2 = new ScalingList[8];
                        scalingMatrix.ScalingList8x8 = scalingListArr2;
                        if (i15 < 6) {
                            scalingListArr[i15] = ScalingList.read(cAVLCReader, 16);
                        } else {
                            scalingListArr2[i15 - 6] = ScalingList.read(cAVLCReader, 64);
                        }
                    }
                }
            }
            pictureParameterSet.extended.second_chroma_qp_index_offset = cAVLCReader.readSE("PPS: second_chroma_qp_index_offset");
        }
        cAVLCReader.readTrailingBits();
        return pictureParameterSet;
    }

    @Override // com.googlecode.mp4parser.h264.model.BitstreamElement
    public void write(OutputStream outputStream) throws IOException {
        CAVLCWriter cAVLCWriter = new CAVLCWriter(outputStream);
        cAVLCWriter.writeUE(this.pic_parameter_set_id, "PPS: pic_parameter_set_id");
        cAVLCWriter.writeUE(this.seq_parameter_set_id, vHmGJpUTWNVV.tTjKuZTBti);
        cAVLCWriter.writeBool(this.entropy_coding_mode_flag, "PPS: entropy_coding_mode_flag");
        cAVLCWriter.writeBool(this.bottom_field_pic_order_in_frame_present_flag, "PPS: pic_order_present_flag");
        cAVLCWriter.writeUE(this.num_slice_groups_minus1, "PPS: num_slice_groups_minus1");
        if (this.num_slice_groups_minus1 > 0) {
            cAVLCWriter.writeUE(this.slice_group_map_type, "PPS: slice_group_map_type");
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            int i10 = this.slice_group_map_type;
            if (i10 == 0) {
                for (int i11 = 0; i11 <= this.num_slice_groups_minus1; i11++) {
                    cAVLCWriter.writeUE(iArr3[i11], "PPS: ");
                }
            } else if (i10 == 2) {
                for (int i12 = 0; i12 < this.num_slice_groups_minus1; i12++) {
                    cAVLCWriter.writeUE(iArr[i12], "PPS: ");
                    cAVLCWriter.writeUE(iArr2[i12], "PPS: ");
                }
            } else {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    cAVLCWriter.writeBool(this.slice_group_change_direction_flag, "PPS: slice_group_change_direction_flag");
                    cAVLCWriter.writeUE(this.slice_group_change_rate_minus1, "PPS: slice_group_change_rate_minus1");
                } else if (i10 == 6) {
                    int i13 = this.num_slice_groups_minus1;
                    int i14 = i13 + 1 <= 4 ? i13 + 1 > 2 ? 2 : 1 : 3;
                    cAVLCWriter.writeUE(this.slice_group_id.length, "PPS: ");
                    int i15 = 0;
                    while (true) {
                        int[] iArr4 = this.slice_group_id;
                        if (i15 > iArr4.length) {
                            break;
                        }
                        cAVLCWriter.writeU(iArr4[i15], i14);
                        i15++;
                    }
                }
            }
        }
        cAVLCWriter.writeUE(this.num_ref_idx_l0_active_minus1, "PPS: num_ref_idx_l0_active_minus1");
        cAVLCWriter.writeUE(this.num_ref_idx_l1_active_minus1, "PPS: num_ref_idx_l1_active_minus1");
        cAVLCWriter.writeBool(this.weighted_pred_flag, "PPS: weighted_pred_flag");
        cAVLCWriter.writeNBit(this.weighted_bipred_idc, 2, "PPS: weighted_bipred_idc");
        cAVLCWriter.writeSE(this.pic_init_qp_minus26, "PPS: pic_init_qp_minus26");
        cAVLCWriter.writeSE(this.pic_init_qs_minus26, "PPS: pic_init_qs_minus26");
        cAVLCWriter.writeSE(this.chroma_qp_index_offset, "PPS: chroma_qp_index_offset");
        cAVLCWriter.writeBool(this.deblocking_filter_control_present_flag, "PPS: deblocking_filter_control_present_flag");
        cAVLCWriter.writeBool(this.constrained_intra_pred_flag, "PPS: constrained_intra_pred_flag");
        cAVLCWriter.writeBool(this.redundant_pic_cnt_present_flag, "PPS: redundant_pic_cnt_present_flag");
        PPSExt pPSExt = this.extended;
        if (pPSExt != null) {
            cAVLCWriter.writeBool(pPSExt.transform_8x8_mode_flag, "PPS: transform_8x8_mode_flag");
            cAVLCWriter.writeBool(this.extended.scalindMatrix != null, "PPS: scalindMatrix");
            if (this.extended.scalindMatrix != null) {
                int i16 = 0;
                while (true) {
                    PPSExt pPSExt2 = this.extended;
                    if (i16 >= ((pPSExt2.transform_8x8_mode_flag ? 1 : 0) * 2) + 6) {
                        break;
                    }
                    if (i16 < 6) {
                        cAVLCWriter.writeBool(pPSExt2.scalindMatrix.ScalingList4x4[i16] != null, "PPS: ");
                        ScalingList scalingList = this.extended.scalindMatrix.ScalingList4x4[i16];
                        if (scalingList != null) {
                            scalingList.write(cAVLCWriter);
                        }
                    } else {
                        int i17 = i16 - 6;
                        cAVLCWriter.writeBool(pPSExt2.scalindMatrix.ScalingList8x8[i17] != null, "PPS: ");
                        ScalingList scalingList2 = this.extended.scalindMatrix.ScalingList8x8[i17];
                        if (scalingList2 != null) {
                            scalingList2.write(cAVLCWriter);
                        }
                    }
                    i16++;
                }
            }
            cAVLCWriter.writeSE(this.extended.second_chroma_qp_index_offset, "PPS: ");
        }
        cAVLCWriter.writeTrailingBits();
    }
}
