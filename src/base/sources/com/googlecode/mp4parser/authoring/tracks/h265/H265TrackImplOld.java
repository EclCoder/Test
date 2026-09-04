package com.googlecode.mp4parser.authoring.tracks.h265;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.h264.read.CAVLCReader;
import com.googlecode.mp4parser.util.ByteBufferByteChannel;
import com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class H265TrackImplOld {
    public static final int AUD_NUT = 35;
    private static final int BLA_N_LP = 18;
    private static final int BLA_W_LP = 16;
    private static final int BLA_W_RADL = 17;
    private static final long BUFFER = 1048576;
    private static final int CRA_NUT = 21;
    private static final int IDR_N_LP = 20;
    private static final int IDR_W_RADL = 19;
    public static final int PPS_NUT = 34;
    public static final int PREFIX_SEI_NUT = 39;
    private static final int RADL_N = 6;
    private static final int RADL_R = 7;
    private static final int RASL_N = 8;
    private static final int RASL_R = 9;
    public static final int RSV_NVCL41 = 41;
    public static final int RSV_NVCL42 = 42;
    public static final int RSV_NVCL43 = 43;
    public static final int RSV_NVCL44 = 44;
    public static final int SPS_NUT = 33;
    private static final int STSA_N = 4;
    private static final int STSA_R = 5;
    private static final int TRAIL_N = 0;
    private static final int TRAIL_R = 1;
    private static final int TSA_N = 2;
    private static final int TSA_R = 3;
    public static final int UNSPEC48 = 48;
    public static final int UNSPEC49 = 49;
    public static final int UNSPEC50 = 50;
    public static final int UNSPEC51 = 51;
    public static final int UNSPEC52 = 52;
    public static final int UNSPEC53 = 53;
    public static final int UNSPEC54 = 54;
    public static final int UNSPEC55 = 55;
    public static final int VPS_NUT = 32;
    LinkedHashMap<Long, ByteBuffer> videoParamterSets = new LinkedHashMap<>();
    LinkedHashMap<Long, ByteBuffer> sequenceParamterSets = new LinkedHashMap<>();
    LinkedHashMap<Long, ByteBuffer> pictureParamterSets = new LinkedHashMap<>();
    List<Long> syncSamples = new ArrayList();
    List<Sample> samples = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class LookAhead {
        ByteBuffer buffer;
        DataSource dataSource;
        long start;
        long bufferStartPos = 0;
        int inBufferPos = 0;

        LookAhead(DataSource dataSource) {
            this.dataSource = dataSource;
            fillBuffer();
        }

        void discardByte() {
            this.inBufferPos++;
        }

        void discardNext3AndMarkStart() {
            int i10 = this.inBufferPos + 3;
            this.inBufferPos = i10;
            this.start = this.bufferStartPos + ((long) i10);
        }

        public void fillBuffer() {
            DataSource dataSource = this.dataSource;
            this.buffer = dataSource.map(this.bufferStartPos, Math.min(dataSource.size() - this.bufferStartPos, H265TrackImplOld.BUFFER));
        }

        public ByteBuffer getNal() {
            long j10 = this.start;
            long j11 = this.bufferStartPos;
            if (j10 < j11) {
                throw new RuntimeException("damn! NAL exceeds buffer");
            }
            this.buffer.position((int) (j10 - j11));
            ByteBuffer byteBufferSlice = this.buffer.slice();
            byteBufferSlice.limit((int) (((long) this.inBufferPos) - (this.start - this.bufferStartPos)));
            return byteBufferSlice;
        }

        boolean nextThreeEquals000or001orEof() {
            int iLimit = this.buffer.limit();
            int i10 = this.inBufferPos;
            if (iLimit - i10 >= 3) {
                return this.buffer.get(i10) == 0 && this.buffer.get(this.inBufferPos + 1) == 0 && (this.buffer.get(this.inBufferPos + 2) == 0 || this.buffer.get(this.inBufferPos + 2) == 1);
            }
            if (this.bufferStartPos + ((long) i10) + 3 > this.dataSource.size()) {
                return this.bufferStartPos + ((long) this.inBufferPos) == this.dataSource.size();
            }
            this.bufferStartPos = this.start;
            this.inBufferPos = 0;
            fillBuffer();
            return nextThreeEquals000or001orEof();
        }

        boolean nextThreeEquals001() throws EOFException {
            int iLimit = this.buffer.limit();
            int i10 = this.inBufferPos;
            if (iLimit - i10 >= 3) {
                return this.buffer.get(i10) == 0 && this.buffer.get(this.inBufferPos + 1) == 0 && this.buffer.get(this.inBufferPos + 2) == 1;
            }
            if (this.bufferStartPos + ((long) i10) == this.dataSource.size()) {
                throw new EOFException();
            }
            throw new RuntimeException("buffer repositioning require");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class NalUnitHeader {
        int forbiddenZeroFlag;
        int nalUnitType;
        int nuhLayerId;
        int nuhTemporalIdPlusOne;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum PARSE_STATE {
        AUD_SEI_SLICE,
        SEI_SLICE,
        SLICE_OES_EOB;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static PARSE_STATE[] valuesCustom() {
            PARSE_STATE[] parse_stateArrValuesCustom = values();
            int length = parse_stateArrValuesCustom.length;
            PARSE_STATE[] parse_stateArr = new PARSE_STATE[length];
            System.arraycopy(parse_stateArrValuesCustom, 0, parse_stateArr, 0, length);
            return parse_stateArr;
        }
    }

    public H265TrackImplOld(DataSource dataSource) {
        LookAhead lookAhead = new LookAhead(dataSource);
        ArrayList arrayList = new ArrayList();
        long j10 = 1;
        long j11 = 1;
        int i10 = 0;
        while (true) {
            ByteBuffer byteBufferFindNextNal = findNextNal(lookAhead);
            if (byteBufferFindNextNal == null) {
                System.err.println("");
                HevcDecoderConfigurationRecord hevcDecoderConfigurationRecord = new HevcDecoderConfigurationRecord();
                hevcDecoderConfigurationRecord.setArrays(getArrays());
                hevcDecoderConfigurationRecord.setAvgFrameRate(0);
                return;
            }
            NalUnitHeader nalUnitHeader = getNalUnitHeader(byteBufferFindNextNal);
            switch (nalUnitHeader.nalUnitType) {
                case 32:
                    this.videoParamterSets.put(Long.valueOf(j11), byteBufferFindNextNal);
                    break;
                case 33:
                    this.sequenceParamterSets.put(Long.valueOf(j11), byteBufferFindNextNal);
                    break;
                case 34:
                    this.pictureParamterSets.put(Long.valueOf(j11), byteBufferFindNextNal);
                    break;
            }
            int i11 = nalUnitHeader.nalUnitType;
            i10 = i11 < 32 ? i11 : i10;
            if (isFirstOfAU(i11, byteBufferFindNextNal, arrayList) && !arrayList.isEmpty()) {
                System.err.println("##########################");
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    NalUnitHeader nalUnitHeader2 = getNalUnitHeader(byteBuffer);
                    System.err.println(String.format("type: %3d - layer: %3d - tempId: %3d - size: %3d", Integer.valueOf(nalUnitHeader2.nalUnitType), Integer.valueOf(nalUnitHeader2.nuhLayerId), Integer.valueOf(nalUnitHeader2.nuhTemporalIdPlusOne), Integer.valueOf(byteBuffer.limit())));
                    j10 = 1;
                }
                System.err.println("                          ##########################");
                this.samples.add(createSample(arrayList));
                arrayList.clear();
                j11 += j10;
            }
            arrayList.add(byteBufferFindNextNal);
            if (i10 >= 16 && i10 <= 21) {
                this.syncSamples.add(Long.valueOf(j11));
            }
            j10 = 1;
        }
    }

    private ByteBuffer findNextNal(LookAhead lookAhead) {
        while (!lookAhead.nextThreeEquals001()) {
            try {
                lookAhead.discardByte();
            } catch (EOFException unused) {
                return null;
            }
        }
        lookAhead.discardNext3AndMarkStart();
        while (!lookAhead.nextThreeEquals000or001orEof()) {
            lookAhead.discardByte();
        }
        return lookAhead.getNal();
    }

    private List<HevcDecoderConfigurationRecord.Array> getArrays() {
        HevcDecoderConfigurationRecord.Array array = new HevcDecoderConfigurationRecord.Array();
        array.array_completeness = true;
        array.nal_unit_type = 32;
        array.nalUnits = new ArrayList();
        for (ByteBuffer byteBuffer : this.videoParamterSets.values()) {
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.position(0);
            byteBuffer.get(bArr);
            array.nalUnits.add(bArr);
        }
        HevcDecoderConfigurationRecord.Array array2 = new HevcDecoderConfigurationRecord.Array();
        array2.array_completeness = true;
        array2.nal_unit_type = 33;
        array2.nalUnits = new ArrayList();
        for (ByteBuffer byteBuffer2 : this.sequenceParamterSets.values()) {
            byte[] bArr2 = new byte[byteBuffer2.limit()];
            byteBuffer2.position(0);
            byteBuffer2.get(bArr2);
            array2.nalUnits.add(bArr2);
        }
        HevcDecoderConfigurationRecord.Array array3 = new HevcDecoderConfigurationRecord.Array();
        array3.array_completeness = true;
        array3.nal_unit_type = 33;
        array3.nalUnits = new ArrayList();
        for (ByteBuffer byteBuffer3 : this.pictureParamterSets.values()) {
            byte[] bArr3 = new byte[byteBuffer3.limit()];
            byteBuffer3.position(0);
            byteBuffer3.get(bArr3);
            array3.nalUnits.add(bArr3);
        }
        return Arrays.asList(array, array2, array3);
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

    public static void main(String[] strArr) {
        new H265TrackImplOld(new FileDataSourceImpl("c:\\content\\test-UHD-HEVC_01_FMV_Med_track1.hvc"));
    }

    protected Sample createSample(List<ByteBuffer> list) {
        byte[] bArr = new byte[list.size() * 4];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Iterator<ByteBuffer> it = list.iterator();
        while (it.hasNext()) {
            byteBufferWrap.putInt(it.next().remaining());
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = i10 * 2;
            byteBufferArr[i11] = ByteBuffer.wrap(bArr, i10 * 4, 4);
            byteBufferArr[i11 + 1] = list.get(i10);
        }
        return new SampleImpl(byteBufferArr);
    }

    public NalUnitHeader getNalUnitHeader(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        int uInt16 = IsoTypeReader.readUInt16(byteBuffer);
        NalUnitHeader nalUnitHeader = new NalUnitHeader();
        nalUnitHeader.forbiddenZeroFlag = (32768 & uInt16) >> 15;
        nalUnitHeader.nalUnitType = (uInt16 & 32256) >> 9;
        nalUnitHeader.nuhLayerId = (uInt16 & PglCryptUtils.BASE64_FAILED) >> 3;
        nalUnitHeader.nuhTemporalIdPlusOne = uInt16 & 7;
        return nalUnitHeader;
    }

    boolean isFirstOfAU(int i10, ByteBuffer byteBuffer, List<ByteBuffer> list) {
        if (list.isEmpty()) {
            return true;
        }
        boolean z10 = getNalUnitHeader(list.get(list.size() - 1)).nalUnitType <= 31;
        switch (i10) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 39:
            case 41:
            case 42:
            case 43:
            case 44:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                if (z10) {
                    return true;
                }
                break;
        }
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                switch (i10) {
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        return false;
                }
                break;
        }
        byteBuffer.position(0);
        byteBuffer.get(new byte[50]);
        byteBuffer.position(2);
        return z10 && (IsoTypeReader.readUInt8(byteBuffer) & 128) > 0;
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

    public int getFrameRate(ByteBuffer byteBuffer) {
        CAVLCReader cAVLCReader = new CAVLCReader(Channels.newInputStream(new ByteBufferByteChannel((ByteBuffer) byteBuffer.position(0))));
        cAVLCReader.readU(4, "vps_parameter_set_id");
        cAVLCReader.readU(2, "vps_reserved_three_2bits");
        cAVLCReader.readU(6, "vps_max_layers_minus1");
        int u10 = cAVLCReader.readU(3, "vps_max_sub_layers_minus1");
        cAVLCReader.readBool("vps_temporal_id_nesting_flag");
        cAVLCReader.readU(16, "vps_reserved_0xffff_16bits");
        profile_tier_level(u10, cAVLCReader);
        boolean bool = cAVLCReader.readBool("vps_sub_layer_ordering_info_present_flag");
        int[] iArr = new int[bool ? 0 : u10];
        int[] iArr2 = new int[bool ? 0 : u10];
        int[] iArr3 = new int[bool ? 0 : u10];
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
            if (cAVLCReader.readBool(PvZsvNiPV.xyclaBH)) {
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
        return 0;
    }
}
