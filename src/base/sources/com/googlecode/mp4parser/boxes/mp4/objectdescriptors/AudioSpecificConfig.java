package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Descriptor(objectTypeIndication = 64, tags = {5})
public class AudioSpecificConfig extends BaseDescriptor {
    public boolean aacScalefactorDataResilienceFlag;
    public boolean aacSectionDataResilienceFlag;
    public boolean aacSpectralDataResilienceFlag;
    public int audioObjectType;
    public int channelConfiguration;
    byte[] configBytes;
    public int coreCoderDelay;
    public int dependsOnCoreCoder;
    public int directMapping;
    public ELDSpecificConfig eldSpecificConfig;
    public int epConfig;
    public int erHvxcExtensionFlag;
    public int extensionAudioObjectType;
    public int extensionChannelConfiguration;
    public int extensionFlag;
    public int extensionFlag3;
    public int extensionSamplingFrequency;
    public int fillBits;
    public int frameLengthFlag;
    public boolean gaSpecificConfig;
    public int hilnContMode;
    public int hilnEnhaLayer;
    public int hilnEnhaQuantMode;
    public int hilnFrameLength;
    public int hilnMaxNumLine;
    public int hilnQuantMode;
    public int hilnSampleRateCode;
    public int hvxcRateMode;
    public int hvxcVarMode;
    public int isBaseLayer;
    public int layerNr;
    public int layer_length;
    public int numOfSubFrame;
    public int origExtensionAudioObjectType;
    public int originalAudioObjectType;
    public int paraExtensionFlag;
    public int paraMode;
    public boolean parametricSpecificConfig;
    public boolean psPresentFlag;
    public int sacPayloadEmbedding;
    public int samplingFrequency;
    public int samplingFrequencyIndex;
    public boolean sbrPresentFlag;
    public int var_ScalableFlag;
    public static Map<Integer, Integer> samplingFrequencyIndexMap = new HashMap();
    public static Map<Integer, String> audioObjectTypeMap = new HashMap();
    public int extensionSamplingFrequencyIndex = -1;
    public int syncExtensionType = -1;
    public int innerSyncExtensionType = -1;
    public int outerSyncExtensionType = -1;
    boolean parsed = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class ELDSpecificConfig {
        private static final int ELDEXT_TERM = 0;
        public boolean aacScalefactorDataResilienceFlag;
        public boolean aacSectionDataResilienceFlag;
        public boolean aacSpectralDataResilienceFlag;
        public boolean frameLengthFlag;
        public boolean ldSbrCrcFlag;
        public boolean ldSbrPresentFlag;
        public boolean ldSbrSamplingRate;

        public ELDSpecificConfig(int i10, BitReaderBuffer bitReaderBuffer) {
            int bits;
            this.frameLengthFlag = bitReaderBuffer.readBool();
            this.aacSectionDataResilienceFlag = bitReaderBuffer.readBool();
            this.aacScalefactorDataResilienceFlag = bitReaderBuffer.readBool();
            this.aacSpectralDataResilienceFlag = bitReaderBuffer.readBool();
            boolean bool = bitReaderBuffer.readBool();
            this.ldSbrPresentFlag = bool;
            if (bool) {
                this.ldSbrSamplingRate = bitReaderBuffer.readBool();
                this.ldSbrCrcFlag = bitReaderBuffer.readBool();
                ld_sbr_header(i10, bitReaderBuffer);
            }
            while (bitReaderBuffer.readBits(4) != 0) {
                int bits2 = bitReaderBuffer.readBits(4);
                if (bits2 == 15) {
                    bits = bitReaderBuffer.readBits(8);
                    bits2 += bits;
                } else {
                    bits = 0;
                }
                if (bits == 255) {
                    bits2 += bitReaderBuffer.readBits(16);
                }
                for (int i11 = 0; i11 < bits2; i11++) {
                    bitReaderBuffer.readBits(8);
                }
            }
        }

        public void ld_sbr_header(int i10, BitReaderBuffer bitReaderBuffer) {
            int i11;
            switch (i10) {
                case 1:
                case 2:
                    i11 = 1;
                    break;
                case 3:
                    i11 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i11 = 3;
                    break;
                case 7:
                    i11 = 4;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                AudioSpecificConfig.this.new sbr_header(bitReaderBuffer);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class sbr_header {
        public boolean bs_alter_scale;
        public boolean bs_amp_res;
        public int bs_freq_scale;
        public boolean bs_header_extra_1;
        public boolean bs_header_extra_2;
        public boolean bs_interpol_freq;
        public int bs_limiter_bands;
        public int bs_limiter_gains;
        public int bs_noise_bands;
        public int bs_reserved;
        public boolean bs_smoothing_mode;
        public int bs_start_freq;
        public int bs_stop_freq;
        public int bs_xover_band;

        public sbr_header(BitReaderBuffer bitReaderBuffer) {
            this.bs_amp_res = bitReaderBuffer.readBool();
            this.bs_start_freq = bitReaderBuffer.readBits(4);
            this.bs_stop_freq = bitReaderBuffer.readBits(4);
            this.bs_xover_band = bitReaderBuffer.readBits(3);
            this.bs_reserved = bitReaderBuffer.readBits(2);
            this.bs_header_extra_1 = bitReaderBuffer.readBool();
            this.bs_header_extra_2 = bitReaderBuffer.readBool();
            if (this.bs_header_extra_1) {
                this.bs_freq_scale = bitReaderBuffer.readBits(2);
                this.bs_alter_scale = bitReaderBuffer.readBool();
                this.bs_noise_bands = bitReaderBuffer.readBits(2);
            }
            if (this.bs_header_extra_2) {
                this.bs_limiter_bands = bitReaderBuffer.readBits(2);
                this.bs_limiter_gains = bitReaderBuffer.readBits(2);
                this.bs_interpol_freq = bitReaderBuffer.readBool();
            }
            this.bs_smoothing_mode = bitReaderBuffer.readBool();
        }
    }

    public AudioSpecificConfig() {
        this.tag = 5;
    }

    private int gaSpecificConfigSize() {
        int i10 = this.dependsOnCoreCoder == 1 ? 16 : 2;
        int i11 = i10 + 1;
        if (this.channelConfiguration == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        int i12 = this.audioObjectType;
        if (i12 == 6 || i12 == 20) {
            i11 = i10 + 4;
        }
        if (this.extensionFlag != 1) {
            return i11;
        }
        if (i12 == 22) {
            i11 += 16;
        }
        if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
            i11 += 3;
        }
        int i13 = i11 + 1;
        if (this.extensionFlag3 != 1) {
            return i13;
        }
        throw new RuntimeException("Not implemented");
    }

    private int getAudioObjectType(BitReaderBuffer bitReaderBuffer) {
        int bits = bitReaderBuffer.readBits(5);
        return bits == 31 ? bitReaderBuffer.readBits(6) + 32 : bits;
    }

    private void parseErHvxcConfig(int i10, int i11, int i12, BitReaderBuffer bitReaderBuffer) {
        this.hvxcVarMode = bitReaderBuffer.readBits(1);
        this.hvxcRateMode = bitReaderBuffer.readBits(2);
        int bits = bitReaderBuffer.readBits(1);
        this.erHvxcExtensionFlag = bits;
        if (bits == 1) {
            this.var_ScalableFlag = bitReaderBuffer.readBits(1);
        }
    }

    private void parseGaSpecificConfig(int i10, int i11, int i12, BitReaderBuffer bitReaderBuffer) {
        this.frameLengthFlag = bitReaderBuffer.readBits(1);
        int bits = bitReaderBuffer.readBits(1);
        this.dependsOnCoreCoder = bits;
        if (bits == 1) {
            this.coreCoderDelay = bitReaderBuffer.readBits(14);
        }
        this.extensionFlag = bitReaderBuffer.readBits(1);
        if (i11 == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        if (i12 == 6 || i12 == 20) {
            this.layerNr = bitReaderBuffer.readBits(3);
        }
        if (this.extensionFlag == 1) {
            if (i12 == 22) {
                this.numOfSubFrame = bitReaderBuffer.readBits(5);
                this.layer_length = bitReaderBuffer.readBits(11);
            }
            if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
                this.aacSectionDataResilienceFlag = bitReaderBuffer.readBool();
                this.aacScalefactorDataResilienceFlag = bitReaderBuffer.readBool();
                this.aacSpectralDataResilienceFlag = bitReaderBuffer.readBool();
            }
            int bits2 = bitReaderBuffer.readBits(1);
            this.extensionFlag3 = bits2;
            if (bits2 == 1) {
                throw new RuntimeException("not yet implemented");
            }
        }
        this.gaSpecificConfig = true;
    }

    private void parseHilnConfig(int i10, int i11, int i12, BitReaderBuffer bitReaderBuffer) {
        this.hilnQuantMode = bitReaderBuffer.readBits(1);
        this.hilnMaxNumLine = bitReaderBuffer.readBits(8);
        this.hilnSampleRateCode = bitReaderBuffer.readBits(4);
        this.hilnFrameLength = bitReaderBuffer.readBits(12);
        this.hilnContMode = bitReaderBuffer.readBits(2);
    }

    private void parseHilnEnexConfig(int i10, int i11, int i12, BitReaderBuffer bitReaderBuffer) {
        int bits = bitReaderBuffer.readBits(1);
        this.hilnEnhaLayer = bits;
        if (bits == 1) {
            this.hilnEnhaQuantMode = bitReaderBuffer.readBits(2);
        }
    }

    private void parseParaConfig(int i10, int i11, int i12, BitReaderBuffer bitReaderBuffer) {
        int bits = bitReaderBuffer.readBits(2);
        this.paraMode = bits;
        if (bits != 1) {
            parseErHvxcConfig(i10, i11, i12, bitReaderBuffer);
        }
        if (this.paraMode != 0) {
            parseHilnConfig(i10, i11, i12, bitReaderBuffer);
        }
        this.paraExtensionFlag = bitReaderBuffer.readBits(1);
        this.parametricSpecificConfig = true;
    }

    private void parseParametricSpecificConfig(int i10, int i11, int i12, BitReaderBuffer bitReaderBuffer) {
        int bits = bitReaderBuffer.readBits(1);
        this.isBaseLayer = bits;
        if (bits == 1) {
            parseParaConfig(i10, i11, i12, bitReaderBuffer);
        } else {
            parseHilnEnexConfig(i10, i11, i12, bitReaderBuffer);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    private ByteBuffer serializeConfigBytes() {
        int i10;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[getContentSize()]);
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBufferWrap);
        writeAudioObjectType(this.originalAudioObjectType, bitWriterBuffer);
        bitWriterBuffer.writeBits(this.samplingFrequencyIndex, 4);
        if (this.samplingFrequencyIndex == 15) {
            bitWriterBuffer.writeBits(this.samplingFrequency, 24);
        }
        bitWriterBuffer.writeBits(this.channelConfiguration, 4);
        int i11 = this.audioObjectType;
        if (i11 == 5 || i11 == 29) {
            this.extensionAudioObjectType = 5;
            this.sbrPresentFlag = true;
            if (i11 == 29) {
                this.psPresentFlag = true;
            }
            bitWriterBuffer.writeBits(this.extensionSamplingFrequencyIndex, 4);
            if (this.extensionSamplingFrequencyIndex == 15) {
                bitWriterBuffer.writeBits(this.extensionSamplingFrequency, 24);
            }
            writeAudioObjectType(this.audioObjectType, bitWriterBuffer);
            if (this.audioObjectType == 22) {
                bitWriterBuffer.writeBits(this.extensionChannelConfiguration, 4);
            }
        }
        switch (this.audioObjectType) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                writeGaSpecificConfig(bitWriterBuffer);
                break;
            case 8:
                throw new UnsupportedOperationException("can't write CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't write HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't write TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't write StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't write ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't write ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                throw new UnsupportedOperationException("can't write parseParametricSpecificConfig yet");
            case 28:
                throw new UnsupportedOperationException("can't write SSCSpecificConfig yet");
            case 30:
                bitWriterBuffer.writeBits(this.sacPayloadEmbedding, 1);
                throw new UnsupportedOperationException("can't write SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't write MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't write DSTSpecificConfig yet");
            case 36:
                bitWriterBuffer.writeBits(this.fillBits, 5);
                throw new UnsupportedOperationException("can't write ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't write SLSSpecificConfig yet");
            case 39:
                throw new UnsupportedOperationException("can't write ELDSpecificConfig yet");
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i12 = this.audioObjectType;
        if (i12 != 17 && i12 != 39) {
            switch (i12) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    bitWriterBuffer.writeBits(this.epConfig, 2);
                    i10 = this.epConfig;
                    if (i10 != 2) {
                        break;
                    }
                    throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
            }
        }
        bitWriterBuffer.writeBits(this.epConfig, 2);
        i10 = this.epConfig;
        if (i10 != 2 || i10 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (i10 == 3) {
            bitWriterBuffer.writeBits(this.directMapping, 1);
            if (this.directMapping == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        int i13 = this.outerSyncExtensionType;
        if (i13 >= 0) {
            bitWriterBuffer.writeBits(i13, 11);
            if (this.outerSyncExtensionType == 695) {
                writeAudioObjectType(this.extensionAudioObjectType, bitWriterBuffer);
                if (this.extensionAudioObjectType == 5) {
                    bitWriterBuffer.writeBool(this.sbrPresentFlag);
                    if (this.sbrPresentFlag) {
                        bitWriterBuffer.writeBits(this.extensionSamplingFrequencyIndex, 4);
                        if (this.extensionSamplingFrequencyIndex == 15) {
                            bitWriterBuffer.writeBits(this.extensionSamplingFrequency, 24);
                        }
                        int i14 = this.innerSyncExtensionType;
                        if (i14 >= 0) {
                            bitWriterBuffer.writeBits(i14, 11);
                            if (this.syncExtensionType == 1352) {
                                bitWriterBuffer.writeBool(this.psPresentFlag);
                            }
                        }
                    }
                }
                if (this.extensionAudioObjectType == 22) {
                    bitWriterBuffer.writeBool(this.sbrPresentFlag);
                    if (this.sbrPresentFlag) {
                        bitWriterBuffer.writeBits(this.extensionSamplingFrequencyIndex, 4);
                        if (this.extensionSamplingFrequencyIndex == 15) {
                            bitWriterBuffer.writeBits(this.extensionSamplingFrequency, 24);
                        }
                    }
                    bitWriterBuffer.writeBits(this.extensionChannelConfiguration, 4);
                }
            }
        }
        return (ByteBuffer) byteBufferWrap.rewind();
    }

    private void writeAudioObjectType(int i10, BitWriterBuffer bitWriterBuffer) {
        if (i10 < 32) {
            bitWriterBuffer.writeBits(i10, 5);
        } else {
            bitWriterBuffer.writeBits(31, 5);
            bitWriterBuffer.writeBits(i10 - 32, 6);
        }
    }

    private void writeGaSpecificConfig(BitWriterBuffer bitWriterBuffer) {
        bitWriterBuffer.writeBits(this.frameLengthFlag, 1);
        bitWriterBuffer.writeBits(this.dependsOnCoreCoder, 1);
        if (this.dependsOnCoreCoder == 1) {
            bitWriterBuffer.writeBits(this.coreCoderDelay, 14);
        }
        bitWriterBuffer.writeBits(this.extensionFlag, 1);
        if (this.channelConfiguration == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        int i10 = this.audioObjectType;
        if (i10 == 6 || i10 == 20) {
            bitWriterBuffer.writeBits(this.layerNr, 3);
        }
        if (this.extensionFlag == 1) {
            if (this.audioObjectType == 22) {
                bitWriterBuffer.writeBits(this.numOfSubFrame, 5);
                bitWriterBuffer.writeBits(this.layer_length, 11);
            }
            int i11 = this.audioObjectType;
            if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                bitWriterBuffer.writeBool(this.aacSectionDataResilienceFlag);
                bitWriterBuffer.writeBool(this.aacScalefactorDataResilienceFlag);
                bitWriterBuffer.writeBool(this.aacSpectralDataResilienceFlag);
            }
            bitWriterBuffer.writeBits(this.extensionFlag3, 1);
            if (this.extensionFlag3 == 1) {
                throw new RuntimeException("not yet implemented");
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioSpecificConfig audioSpecificConfig = (AudioSpecificConfig) obj;
        return this.aacScalefactorDataResilienceFlag == audioSpecificConfig.aacScalefactorDataResilienceFlag && this.aacSectionDataResilienceFlag == audioSpecificConfig.aacSectionDataResilienceFlag && this.aacSpectralDataResilienceFlag == audioSpecificConfig.aacSpectralDataResilienceFlag && this.audioObjectType == audioSpecificConfig.audioObjectType && this.channelConfiguration == audioSpecificConfig.channelConfiguration && this.coreCoderDelay == audioSpecificConfig.coreCoderDelay && this.dependsOnCoreCoder == audioSpecificConfig.dependsOnCoreCoder && this.directMapping == audioSpecificConfig.directMapping && this.epConfig == audioSpecificConfig.epConfig && this.erHvxcExtensionFlag == audioSpecificConfig.erHvxcExtensionFlag && this.extensionAudioObjectType == audioSpecificConfig.extensionAudioObjectType && this.extensionChannelConfiguration == audioSpecificConfig.extensionChannelConfiguration && this.extensionFlag == audioSpecificConfig.extensionFlag && this.extensionFlag3 == audioSpecificConfig.extensionFlag3 && this.extensionSamplingFrequency == audioSpecificConfig.extensionSamplingFrequency && this.extensionSamplingFrequencyIndex == audioSpecificConfig.extensionSamplingFrequencyIndex && this.fillBits == audioSpecificConfig.fillBits && this.frameLengthFlag == audioSpecificConfig.frameLengthFlag && this.gaSpecificConfig == audioSpecificConfig.gaSpecificConfig && this.hilnContMode == audioSpecificConfig.hilnContMode && this.hilnEnhaLayer == audioSpecificConfig.hilnEnhaLayer && this.hilnEnhaQuantMode == audioSpecificConfig.hilnEnhaQuantMode && this.hilnFrameLength == audioSpecificConfig.hilnFrameLength && this.hilnMaxNumLine == audioSpecificConfig.hilnMaxNumLine && this.hilnQuantMode == audioSpecificConfig.hilnQuantMode && this.hilnSampleRateCode == audioSpecificConfig.hilnSampleRateCode && this.hvxcRateMode == audioSpecificConfig.hvxcRateMode && this.hvxcVarMode == audioSpecificConfig.hvxcVarMode && this.isBaseLayer == audioSpecificConfig.isBaseLayer && this.layerNr == audioSpecificConfig.layerNr && this.layer_length == audioSpecificConfig.layer_length && this.numOfSubFrame == audioSpecificConfig.numOfSubFrame && this.paraExtensionFlag == audioSpecificConfig.paraExtensionFlag && this.paraMode == audioSpecificConfig.paraMode && this.parametricSpecificConfig == audioSpecificConfig.parametricSpecificConfig && this.psPresentFlag == audioSpecificConfig.psPresentFlag && this.sacPayloadEmbedding == audioSpecificConfig.sacPayloadEmbedding && this.samplingFrequency == audioSpecificConfig.samplingFrequency && this.samplingFrequencyIndex == audioSpecificConfig.samplingFrequencyIndex && this.sbrPresentFlag == audioSpecificConfig.sbrPresentFlag && this.syncExtensionType == audioSpecificConfig.syncExtensionType && this.var_ScalableFlag == audioSpecificConfig.var_ScalableFlag && Arrays.equals(this.configBytes, audioSpecificConfig.configBytes);
    }

    public int getChannelConfiguration() {
        return this.channelConfiguration;
    }

    public byte[] getConfigBytes() {
        return serializeConfigBytes().array();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
        int i10 = this.originalAudioObjectType > 30 ? 11 : 5;
        int i11 = i10 + 4;
        if (this.samplingFrequencyIndex == 15) {
            i11 = i10 + 28;
        }
        int iGaSpecificConfigSize = i11 + 4;
        int i12 = this.audioObjectType;
        if (i12 == 5 || i12 == 29) {
            iGaSpecificConfigSize = i11 + 8;
            if (this.extensionSamplingFrequencyIndex == 15) {
                iGaSpecificConfigSize = i11 + 32;
            }
        }
        if (i12 == 22) {
            iGaSpecificConfigSize += 4;
        }
        if (this.gaSpecificConfig) {
            iGaSpecificConfigSize += gaSpecificConfigSize();
        }
        int i13 = this.outerSyncExtensionType;
        if (i13 >= 0) {
            int i14 = iGaSpecificConfigSize + 11;
            if (i13 == 695) {
                int i15 = iGaSpecificConfigSize + 16;
                int i16 = this.extensionAudioObjectType;
                if (i16 > 30) {
                    i15 = iGaSpecificConfigSize + 22;
                }
                if (i16 == 5) {
                    iGaSpecificConfigSize = i15 + 1;
                    if (this.sbrPresentFlag) {
                        iGaSpecificConfigSize = i15 + 5;
                        if (this.extensionSamplingFrequencyIndex == 15) {
                            iGaSpecificConfigSize = i15 + 29;
                        }
                        int i17 = this.innerSyncExtensionType;
                        if (i17 >= 0) {
                            iGaSpecificConfigSize = i17 == 1352 ? iGaSpecificConfigSize + 12 : iGaSpecificConfigSize + 11;
                        }
                    }
                } else {
                    iGaSpecificConfigSize = i15;
                }
                if (i16 == 22) {
                    int i18 = iGaSpecificConfigSize + 1;
                    if (this.sbrPresentFlag) {
                        i18 = iGaSpecificConfigSize + 5;
                        if (this.extensionSamplingFrequencyIndex == 15) {
                            i18 = iGaSpecificConfigSize + 29;
                        }
                    }
                    iGaSpecificConfigSize = i18 + 4;
                }
            } else {
                iGaSpecificConfigSize = i14;
            }
        }
        return (int) Math.ceil(((double) iGaSpecificConfigSize) / 8.0d);
    }

    public int getExtensionAudioObjectType() {
        return this.extensionAudioObjectType;
    }

    public int getExtensionSamplingFrequency() {
        int i10 = this.extensionSamplingFrequencyIndex;
        return i10 == 15 ? this.extensionSamplingFrequency : samplingFrequencyIndexMap.get(Integer.valueOf(i10)).intValue();
    }

    public int getSamplingFrequency() {
        int i10 = this.samplingFrequencyIndex;
        return i10 == 15 ? this.samplingFrequency : samplingFrequencyIndexMap.get(Integer.valueOf(i10)).intValue();
    }

    public int hashCode() {
        byte[] bArr = this.configBytes;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.audioObjectType) * 31) + this.samplingFrequencyIndex) * 31) + this.samplingFrequency) * 31) + this.channelConfiguration) * 31) + this.extensionAudioObjectType) * 31) + (this.sbrPresentFlag ? 1 : 0)) * 31) + (this.psPresentFlag ? 1 : 0)) * 31) + this.extensionSamplingFrequencyIndex) * 31) + this.extensionSamplingFrequency) * 31) + this.extensionChannelConfiguration) * 31) + this.sacPayloadEmbedding) * 31) + this.fillBits) * 31) + this.epConfig) * 31) + this.directMapping) * 31) + this.syncExtensionType) * 31) + this.frameLengthFlag) * 31) + this.dependsOnCoreCoder) * 31) + this.coreCoderDelay) * 31) + this.extensionFlag) * 31) + this.layerNr) * 31) + this.numOfSubFrame) * 31) + this.layer_length) * 31) + (this.aacSectionDataResilienceFlag ? 1 : 0)) * 31) + (this.aacScalefactorDataResilienceFlag ? 1 : 0)) * 31) + (this.aacSpectralDataResilienceFlag ? 1 : 0)) * 31) + this.extensionFlag3) * 31) + (this.gaSpecificConfig ? 1 : 0)) * 31) + this.isBaseLayer) * 31) + this.paraMode) * 31) + this.paraExtensionFlag) * 31) + this.hvxcVarMode) * 31) + this.hvxcRateMode) * 31) + this.erHvxcExtensionFlag) * 31) + this.var_ScalableFlag) * 31) + this.hilnQuantMode) * 31) + this.hilnMaxNumLine) * 31) + this.hilnSampleRateCode) * 31) + this.hilnFrameLength) * 31) + this.hilnContMode) * 31) + this.hilnEnhaLayer) * 31) + this.hilnEnhaQuantMode) * 31) + (this.parametricSpecificConfig ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) {
        int bits;
        this.parsed = true;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.sizeOfInstance);
        byteBuffer.position(byteBuffer.position() + this.sizeOfInstance);
        byte[] bArr = new byte[this.sizeOfInstance];
        this.configBytes = bArr;
        byteBufferSlice.get(bArr);
        byteBufferSlice.rewind();
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBufferSlice);
        int audioObjectType = getAudioObjectType(bitReaderBuffer);
        this.audioObjectType = audioObjectType;
        this.originalAudioObjectType = audioObjectType;
        int bits2 = bitReaderBuffer.readBits(4);
        this.samplingFrequencyIndex = bits2;
        if (bits2 == 15) {
            this.samplingFrequency = bitReaderBuffer.readBits(24);
        }
        this.channelConfiguration = bitReaderBuffer.readBits(4);
        int i10 = this.audioObjectType;
        if (i10 == 5 || i10 == 29) {
            this.extensionAudioObjectType = 5;
            this.sbrPresentFlag = true;
            if (i10 == 29) {
                this.psPresentFlag = true;
            }
            int bits3 = bitReaderBuffer.readBits(4);
            this.extensionSamplingFrequencyIndex = bits3;
            if (bits3 == 15) {
                this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
            }
            int audioObjectType2 = getAudioObjectType(bitReaderBuffer);
            this.audioObjectType = audioObjectType2;
            if (audioObjectType2 == 22) {
                this.extensionChannelConfiguration = bitReaderBuffer.readBits(4);
            }
        } else {
            this.extensionAudioObjectType = 0;
        }
        int i11 = this.audioObjectType;
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                parseGaSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, i11, bitReaderBuffer);
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                parseParametricSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, i11, bitReaderBuffer);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.sacPayloadEmbedding = bitReaderBuffer.readBits(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.fillBits = bitReaderBuffer.readBits(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.eldSpecificConfig = new ELDSpecificConfig(this.channelConfiguration, bitReaderBuffer);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i12 = this.audioObjectType;
        if (i12 != 17 && i12 != 39) {
            switch (i12) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    bits = bitReaderBuffer.readBits(2);
                    this.epConfig = bits;
                    if (bits != 2) {
                        break;
                    }
                    throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
            }
        }
        bits = bitReaderBuffer.readBits(2);
        this.epConfig = bits;
        if (bits != 2 || bits == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (bits == 3) {
            int bits4 = bitReaderBuffer.readBits(1);
            this.directMapping = bits4;
            if (bits4 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.extensionAudioObjectType == 5 || bitReaderBuffer.remainingBits() < 16) {
            return;
        }
        int bits5 = bitReaderBuffer.readBits(11);
        this.syncExtensionType = bits5;
        this.outerSyncExtensionType = bits5;
        if (bits5 == 695) {
            int audioObjectType3 = getAudioObjectType(bitReaderBuffer);
            this.extensionAudioObjectType = audioObjectType3;
            if (audioObjectType3 == 5) {
                boolean bool = bitReaderBuffer.readBool();
                this.sbrPresentFlag = bool;
                if (bool) {
                    int bits6 = bitReaderBuffer.readBits(4);
                    this.extensionSamplingFrequencyIndex = bits6;
                    if (bits6 == 15) {
                        this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                    }
                    if (bitReaderBuffer.remainingBits() >= 12) {
                        int bits7 = bitReaderBuffer.readBits(11);
                        this.syncExtensionType = bits7;
                        this.innerSyncExtensionType = bits7;
                        if (bits7 == 1352) {
                            this.psPresentFlag = bitReaderBuffer.readBool();
                        }
                    }
                }
            }
            if (this.extensionAudioObjectType == 22) {
                boolean bool2 = bitReaderBuffer.readBool();
                this.sbrPresentFlag = bool2;
                if (bool2) {
                    int bits8 = bitReaderBuffer.readBits(4);
                    this.extensionSamplingFrequencyIndex = bits8;
                    if (bits8 == 15) {
                        this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                    }
                }
                this.extensionChannelConfiguration = bitReaderBuffer.readBits(4);
            }
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getSize());
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.tag);
        writeSize(byteBufferAllocate, getContentSize());
        byteBufferAllocate.put(serializeConfigBytes());
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    public void setAudioObjectType(int i10) {
        this.audioObjectType = i10;
    }

    public void setChannelConfiguration(int i10) {
        this.channelConfiguration = i10;
    }

    public void setOriginalAudioObjectType(int i10) {
        this.originalAudioObjectType = i10;
    }

    public void setSamplingFrequency(int i10) {
        this.samplingFrequency = i10;
    }

    public void setSamplingFrequencyIndex(int i10) {
        this.samplingFrequencyIndex = i10;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioSpecificConfig");
        sb2.append("{configBytes=");
        sb2.append(Hex.encodeHex(this.configBytes));
        sb2.append(", audioObjectType=");
        sb2.append(this.audioObjectType);
        sb2.append(" (");
        sb2.append(audioObjectTypeMap.get(Integer.valueOf(this.audioObjectType)));
        sb2.append(")");
        sb2.append(", samplingFrequencyIndex=");
        sb2.append(this.samplingFrequencyIndex);
        sb2.append(" (");
        sb2.append(samplingFrequencyIndexMap.get(Integer.valueOf(this.samplingFrequencyIndex)));
        sb2.append(")");
        sb2.append(", samplingFrequency=");
        sb2.append(this.samplingFrequency);
        sb2.append(", channelConfiguration=");
        sb2.append(this.channelConfiguration);
        if (this.extensionAudioObjectType > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.extensionAudioObjectType);
            sb2.append(" (");
            sb2.append(audioObjectTypeMap.get(Integer.valueOf(this.extensionAudioObjectType)));
            sb2.append(")");
            sb2.append(", sbrPresentFlag=");
            sb2.append(this.sbrPresentFlag);
            sb2.append(", psPresentFlag=");
            sb2.append(this.psPresentFlag);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.extensionSamplingFrequencyIndex);
            sb2.append(" (");
            sb2.append(samplingFrequencyIndexMap.get(Integer.valueOf(this.extensionSamplingFrequencyIndex)));
            sb2.append(")");
            sb2.append(", extensionSamplingFrequency=");
            sb2.append(this.extensionSamplingFrequency);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.extensionChannelConfiguration);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.syncExtensionType);
        if (this.gaSpecificConfig) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.frameLengthFlag);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.dependsOnCoreCoder);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.coreCoderDelay);
            sb2.append(", extensionFlag=");
            sb2.append(this.extensionFlag);
            sb2.append(", layerNr=");
            sb2.append(this.layerNr);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.numOfSubFrame);
            sb2.append(", layer_length=");
            sb2.append(this.layer_length);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.aacSectionDataResilienceFlag);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.aacScalefactorDataResilienceFlag);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.aacSpectralDataResilienceFlag);
            sb2.append(", extensionFlag3=");
            sb2.append(this.extensionFlag3);
        }
        if (this.parametricSpecificConfig) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.isBaseLayer);
            sb2.append(", paraMode=");
            sb2.append(this.paraMode);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.paraExtensionFlag);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.hvxcVarMode);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.hvxcRateMode);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.erHvxcExtensionFlag);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.var_ScalableFlag);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.hilnQuantMode);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.hilnMaxNumLine);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.hilnSampleRateCode);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.hilnFrameLength);
            sb2.append(", hilnContMode=");
            sb2.append(this.hilnContMode);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.hilnEnhaLayer);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.hilnEnhaQuantMode);
        }
        sb2.append('}');
        return sb2.toString();
    }

    static {
        samplingFrequencyIndexMap.put(0, 96000);
        samplingFrequencyIndexMap.put(1, 88200);
        samplingFrequencyIndexMap.put(2, 64000);
        samplingFrequencyIndexMap.put(3, 48000);
        samplingFrequencyIndexMap.put(4, 44100);
        samplingFrequencyIndexMap.put(5, 32000);
        samplingFrequencyIndexMap.put(6, 24000);
        samplingFrequencyIndexMap.put(7, 22050);
        samplingFrequencyIndexMap.put(8, 16000);
        samplingFrequencyIndexMap.put(9, 12000);
        samplingFrequencyIndexMap.put(10, 11025);
        samplingFrequencyIndexMap.put(11, 8000);
        audioObjectTypeMap.put(1, "AAC main");
        audioObjectTypeMap.put(2, "AAC LC");
        audioObjectTypeMap.put(3, "AAC SSR");
        audioObjectTypeMap.put(4, "AAC LTP");
        audioObjectTypeMap.put(5, "SBR");
        audioObjectTypeMap.put(6, "AAC Scalable");
        audioObjectTypeMap.put(7, "TwinVQ");
        audioObjectTypeMap.put(8, "CELP");
        audioObjectTypeMap.put(9, "HVXC");
        audioObjectTypeMap.put(10, "(reserved)");
        audioObjectTypeMap.put(11, "(reserved)");
        audioObjectTypeMap.put(12, "TTSI");
        audioObjectTypeMap.put(13, UoyZyZEcGYBpIg.xnuZBUmTMJWgumd);
        audioObjectTypeMap.put(14, "Wavetable synthesis");
        audioObjectTypeMap.put(15, "General MIDI");
        audioObjectTypeMap.put(16, "Algorithmic Synthesis and Audio FX");
        audioObjectTypeMap.put(17, "ER AAC LC");
        audioObjectTypeMap.put(18, "(reserved)");
        audioObjectTypeMap.put(19, "ER AAC LTP");
        audioObjectTypeMap.put(20, "ER AAC Scalable");
        audioObjectTypeMap.put(21, "ER TwinVQ");
        audioObjectTypeMap.put(22, "ER BSAC");
        audioObjectTypeMap.put(23, "ER AAC LD");
        audioObjectTypeMap.put(24, "ER CELP");
        audioObjectTypeMap.put(25, "ER HVXC");
        audioObjectTypeMap.put(26, "ER HILN");
        audioObjectTypeMap.put(27, "ER Parametric");
        audioObjectTypeMap.put(28, "SSC");
        audioObjectTypeMap.put(29, "PS");
        audioObjectTypeMap.put(30, "MPEG Surround");
        audioObjectTypeMap.put(31, "(escape)");
        audioObjectTypeMap.put(32, "Layer-1");
        audioObjectTypeMap.put(33, "Layer-2");
        audioObjectTypeMap.put(34, "Layer-3");
        audioObjectTypeMap.put(35, "DST");
        audioObjectTypeMap.put(36, "ALS");
        audioObjectTypeMap.put(37, "SLS");
        audioObjectTypeMap.put(38, "SLS non-core");
        audioObjectTypeMap.put(39, "ER AAC ELD");
        audioObjectTypeMap.put(40, "SMR Simple");
        audioObjectTypeMap.put(41, "SMR Main");
    }

    public int getAudioObjectType() {
        return this.audioObjectType;
    }
}
