package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class InitialObjectDescriptor extends ObjectDescriptorBase {
    int audioProfileLevelIndication;
    int graphicsProfileLevelIndication;
    int includeInlineProfileLevelFlag;
    int oDProfileLevelIndication;
    private int objectDescriptorId;
    int sceneProfileLevelIndication;
    int urlFlag;
    int urlLength;
    String urlString;
    int visualProfileLevelIndication;
    List<ESDescriptor> esDescriptors = new ArrayList();
    List<ExtensionDescriptor> extensionDescriptors = new ArrayList();
    List<BaseDescriptor> unknownDescriptors = new ArrayList();

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer) {
        int size;
        int uInt16 = IsoTypeReader.readUInt16(byteBuffer);
        this.objectDescriptorId = (65472 & uInt16) >> 6;
        this.urlFlag = (uInt16 & 63) >> 5;
        this.includeInlineProfileLevelFlag = (uInt16 & 31) >> 4;
        int size2 = getSize();
        int i10 = size2 - 2;
        if (this.urlFlag == 1) {
            int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
            this.urlLength = uInt8;
            this.urlString = IsoTypeReader.readString(byteBuffer, uInt8);
            size = i10 - (this.urlLength + 1);
        } else {
            this.oDProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.sceneProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.audioProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.visualProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.graphicsProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            size = size2 - 7;
            if (size > 2) {
                BaseDescriptor baseDescriptorCreateFrom = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
                size -= baseDescriptorCreateFrom.getSize();
                if (baseDescriptorCreateFrom instanceof ESDescriptor) {
                    this.esDescriptors.add((ESDescriptor) baseDescriptorCreateFrom);
                } else {
                    this.unknownDescriptors.add(baseDescriptorCreateFrom);
                }
            }
        }
        if (size > 2) {
            BaseDescriptor baseDescriptorCreateFrom2 = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
            if (baseDescriptorCreateFrom2 instanceof ExtensionDescriptor) {
                this.extensionDescriptors.add((ExtensionDescriptor) baseDescriptorCreateFrom2);
            } else {
                this.unknownDescriptors.add(baseDescriptorCreateFrom2);
            }
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public String toString() {
        return "InitialObjectDescriptor{objectDescriptorId=" + this.objectDescriptorId + ", urlFlag=" + this.urlFlag + ", includeInlineProfileLevelFlag=" + this.includeInlineProfileLevelFlag + ", urlLength=" + this.urlLength + ", urlString='" + this.urlString + "', oDProfileLevelIndication=" + this.oDProfileLevelIndication + ", sceneProfileLevelIndication=" + this.sceneProfileLevelIndication + ", audioProfileLevelIndication=" + this.audioProfileLevelIndication + ", visualProfileLevelIndication=" + this.visualProfileLevelIndication + ", graphicsProfileLevelIndication=" + this.graphicsProfileLevelIndication + ", esDescriptors=" + this.esDescriptors + ", extensionDescriptors=" + this.extensionDescriptors + ", unknownDescriptors=" + this.unknownDescriptors + '}';
    }
}
