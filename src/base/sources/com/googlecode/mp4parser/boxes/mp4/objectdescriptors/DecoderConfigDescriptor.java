package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Descriptor(tags = {4})
public class DecoderConfigDescriptor extends BaseDescriptor {
    private static Logger log = Logger.getLogger(DecoderConfigDescriptor.class.getName());
    AudioSpecificConfig audioSpecificInfo;
    long avgBitRate;
    int bufferSizeDB;
    byte[] configDescriptorDeadBytes;
    DecoderSpecificInfo decoderSpecificInfo;
    long maxBitRate;
    int objectTypeIndication;
    List<ProfileLevelIndicationDescriptor> profileLevelIndicationDescriptors = new ArrayList();
    int streamType;
    int upStream;

    public DecoderConfigDescriptor() {
        this.tag = 4;
    }

    public AudioSpecificConfig getAudioSpecificInfo() {
        return this.audioSpecificInfo;
    }

    public long getAvgBitRate() {
        return this.avgBitRate;
    }

    public int getBufferSizeDB() {
        return this.bufferSizeDB;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    int getContentSize() {
        AudioSpecificConfig audioSpecificConfig = this.audioSpecificInfo;
        int size = (audioSpecificConfig == null ? 0 : audioSpecificConfig.getSize()) + 13;
        DecoderSpecificInfo decoderSpecificInfo = this.decoderSpecificInfo;
        int size2 = size + (decoderSpecificInfo != null ? decoderSpecificInfo.getSize() : 0);
        Iterator<ProfileLevelIndicationDescriptor> it = this.profileLevelIndicationDescriptors.iterator();
        while (it.hasNext()) {
            size2 += it.next().getSize();
        }
        return size2;
    }

    public DecoderSpecificInfo getDecoderSpecificInfo() {
        return this.decoderSpecificInfo;
    }

    public long getMaxBitRate() {
        return this.maxBitRate;
    }

    public int getObjectTypeIndication() {
        return this.objectTypeIndication;
    }

    public List<ProfileLevelIndicationDescriptor> getProfileLevelIndicationDescriptors() {
        return this.profileLevelIndicationDescriptors;
    }

    public int getStreamType() {
        return this.streamType;
    }

    public int getUpStream() {
        return this.upStream;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) {
        int size;
        this.objectTypeIndication = IsoTypeReader.readUInt8(byteBuffer);
        int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.streamType = uInt8 >>> 2;
        this.upStream = (uInt8 >> 1) & 1;
        this.bufferSizeDB = IsoTypeReader.readUInt24(byteBuffer);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer);
        while (byteBuffer.remaining() > 2) {
            int iPosition = byteBuffer.position();
            BaseDescriptor baseDescriptorCreateFrom = ObjectDescriptorFactory.createFrom(this.objectTypeIndication, byteBuffer);
            int iPosition2 = byteBuffer.position() - iPosition;
            Logger logger = log;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(baseDescriptorCreateFrom);
            sb2.append(" - DecoderConfigDescr1 read: ");
            sb2.append(iPosition2);
            sb2.append(", size: ");
            sb2.append(baseDescriptorCreateFrom != null ? Integer.valueOf(baseDescriptorCreateFrom.getSize()) : null);
            logger.finer(sb2.toString());
            if (baseDescriptorCreateFrom != null && iPosition2 < (size = baseDescriptorCreateFrom.getSize())) {
                byte[] bArr = new byte[size - iPosition2];
                this.configDescriptorDeadBytes = bArr;
                byteBuffer.get(bArr);
            }
            if (baseDescriptorCreateFrom instanceof DecoderSpecificInfo) {
                this.decoderSpecificInfo = (DecoderSpecificInfo) baseDescriptorCreateFrom;
            } else if (baseDescriptorCreateFrom instanceof AudioSpecificConfig) {
                this.audioSpecificInfo = (AudioSpecificConfig) baseDescriptorCreateFrom;
            } else if (baseDescriptorCreateFrom instanceof ProfileLevelIndicationDescriptor) {
                this.profileLevelIndicationDescriptors.add((ProfileLevelIndicationDescriptor) baseDescriptorCreateFrom);
            }
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(getSize());
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.tag);
        writeSize(byteBufferAllocate, getContentSize());
        IsoTypeWriter.writeUInt8(byteBufferAllocate, this.objectTypeIndication);
        IsoTypeWriter.writeUInt8(byteBufferAllocate, (this.streamType << 2) | (this.upStream << 1) | 1);
        IsoTypeWriter.writeUInt24(byteBufferAllocate, this.bufferSizeDB);
        IsoTypeWriter.writeUInt32(byteBufferAllocate, this.maxBitRate);
        IsoTypeWriter.writeUInt32(byteBufferAllocate, this.avgBitRate);
        DecoderSpecificInfo decoderSpecificInfo = this.decoderSpecificInfo;
        if (decoderSpecificInfo != null) {
            byteBufferAllocate.put(decoderSpecificInfo.serialize());
        }
        AudioSpecificConfig audioSpecificConfig = this.audioSpecificInfo;
        if (audioSpecificConfig != null) {
            byteBufferAllocate.put(audioSpecificConfig.serialize());
        }
        Iterator<ProfileLevelIndicationDescriptor> it = this.profileLevelIndicationDescriptors.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next().serialize());
        }
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    public void setAudioSpecificInfo(AudioSpecificConfig audioSpecificConfig) {
        this.audioSpecificInfo = audioSpecificConfig;
    }

    public void setAvgBitRate(long j10) {
        this.avgBitRate = j10;
    }

    public void setBufferSizeDB(int i10) {
        this.bufferSizeDB = i10;
    }

    public void setDecoderSpecificInfo(DecoderSpecificInfo decoderSpecificInfo) {
        this.decoderSpecificInfo = decoderSpecificInfo;
    }

    public void setMaxBitRate(long j10) {
        this.maxBitRate = j10;
    }

    public void setObjectTypeIndication(int i10) {
        this.objectTypeIndication = i10;
    }

    public void setStreamType(int i10) {
        this.streamType = i10;
    }

    public void setUpStream(int i10) {
        this.upStream = i10;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderConfigDescriptor");
        sb2.append("{objectTypeIndication=");
        sb2.append(this.objectTypeIndication);
        sb2.append(", streamType=");
        sb2.append(this.streamType);
        sb2.append(", upStream=");
        sb2.append(this.upStream);
        sb2.append(", bufferSizeDB=");
        sb2.append(this.bufferSizeDB);
        sb2.append(", maxBitRate=");
        sb2.append(this.maxBitRate);
        sb2.append(", avgBitRate=");
        sb2.append(this.avgBitRate);
        sb2.append(", decoderSpecificInfo=");
        sb2.append(this.decoderSpecificInfo);
        sb2.append(", audioSpecificInfo=");
        sb2.append(this.audioSpecificInfo);
        sb2.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.configDescriptorDeadBytes;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb2.append(Hex.encodeHex(bArr));
        sb2.append(", profileLevelIndicationDescriptors=");
        List<ProfileLevelIndicationDescriptor> list = this.profileLevelIndicationDescriptors;
        sb2.append(list == null ? "null" : Arrays.asList(list).toString());
        sb2.append('}');
        return sb2.toString();
    }
}
