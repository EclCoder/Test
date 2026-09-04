package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Descriptor(tags = {0})
public abstract class BaseDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    int sizeBytes;
    int sizeOfInstance;
    int tag;

    abstract int getContentSize();

    public int getSize() {
        return getContentSize() + getSizeSize() + 1;
    }

    public int getSizeSize() {
        int contentSize = getContentSize();
        int i10 = 0;
        while (true) {
            if (contentSize <= 0 && i10 >= this.sizeBytes) {
                return i10;
            }
            contentSize >>>= 7;
            i10++;
        }
    }

    public int getTag() {
        return this.tag;
    }

    public final void parse(int i10, ByteBuffer byteBuffer) {
        this.tag = i10;
        int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.sizeOfInstance = uInt8 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i11 = 1;
        while ((uInt8 >>> 7) == 1) {
            uInt8 = IsoTypeReader.readUInt8(byteBuffer);
            i11++;
            this.sizeOfInstance = (this.sizeOfInstance << 7) | (uInt8 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        this.sizeBytes = i11;
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit(this.sizeOfInstance);
        parseDetail(byteBufferSlice);
        byteBuffer.position(byteBuffer.position() + this.sizeOfInstance);
    }

    public abstract void parseDetail(ByteBuffer byteBuffer);

    public abstract ByteBuffer serialize();

    public String toString() {
        return "BaseDescriptor{tag=" + this.tag + ", sizeOfInstance=" + this.sizeOfInstance + '}';
    }

    public void writeSize(ByteBuffer byteBuffer, int i10) {
        int iPosition = byteBuffer.position();
        int i11 = 0;
        while (true) {
            if (i10 <= 0 && i11 >= this.sizeBytes) {
                byteBuffer.position(iPosition + getSizeSize());
                return;
            }
            i11++;
            if (i10 > 0) {
                byteBuffer.put((getSizeSize() + iPosition) - i11, (byte) (i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
            } else {
                byteBuffer.put((getSizeSize() + iPosition) - i11, (byte) -128);
            }
            i10 >>>= 7;
        }
    }
}
