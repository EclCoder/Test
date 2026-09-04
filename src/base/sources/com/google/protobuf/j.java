package com.google.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    k wrapper;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends j {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private void recomputeBufferSizeAfterLimit() {
            int i10 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i10;
            int i11 = i10 - this.startPos;
            int i12 = this.currentLimit;
            if (i11 <= i12) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i13 = i11 - i12;
            this.bufferSizeAfterLimit = i13;
            this.limit = i10 - i13;
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.buffer;
                int i11 = this.pos;
                this.pos = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.j
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.lastTag != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.j
        public void enableAliasing(boolean z10) {
            this.enableAliasing = z10;
        }

        @Override // com.google.protobuf.j
        public int getBytesUntilLimit() {
            int i10 = this.currentLimit;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.j
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.j
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.j
        public boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.j
        public void popLimit(int i10) {
            this.currentLimit = i10;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.j
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i10 + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i11 = this.currentLimit;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i11;
        }

        @Override // com.google.protobuf.j
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.j
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.j
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.limit;
                int i11 = this.pos;
                if (rawVarint32 <= i10 - i11) {
                    ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i11, i11 + rawVarint32)) : ByteBuffer.wrap(this.buffer, i11, rawVarint32).slice();
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return a0.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public i readBytes() {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.limit;
                int i11 = this.pos;
                if (rawVarint32 <= i10 - i11) {
                    i iVarWrap = (this.immutable && this.enableAliasing) ? i.wrap(this.buffer, i11, rawVarint32) : i.copyFrom(this.buffer, i11, rawVarint32);
                    this.pos += rawVarint32;
                    return iVarWrap;
                }
            }
            return rawVarint32 == 0 ? i.EMPTY : i.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.j
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.j
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.j
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.j
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.j
        public void readGroup(int i10, s0.a aVar, p pVar) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            aVar.mergeFrom(this, pVar);
            checkLastTagWas(x1.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.j
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.j
        public void readMessage(s0.a aVar, p pVar) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            aVar.mergeFrom(this, pVar);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.j
        public byte readRawByte() throws InvalidProtocolBufferException {
            int i10 = this.pos;
            if (i10 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i10 + 1;
            return bArr[i10];
        }

        @Override // com.google.protobuf.j
        public byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 > 0) {
                int i11 = this.limit;
                int i12 = this.pos;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.pos = i13;
                    return Arrays.copyOfRange(this.buffer, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                return a0.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.j
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            int i10 = this.pos;
            if (this.limit - i10 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i10 + 4;
            return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // com.google.protobuf.j
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            int i10 = this.pos;
            if (this.limit - i10 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.j
        public int readRawVarint32() {
            int i10;
            int i11 = this.pos;
            int i12 = this.limit;
            if (i12 != i11) {
                byte[] bArr = this.buffer;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.pos = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.pos = i14;
                    return i10;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.j
        public long readRawVarint64() {
            long j10;
            long j11;
            long j12;
            int i10 = this.pos;
            int i11 = this.limit;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.pos = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.pos = i13;
                    return j10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.j
        long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.j
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.j
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.j
        public int readSInt32() {
            return j.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.j
        public long readSInt64() {
            return j.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.j
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.limit;
                int i11 = this.pos;
                if (rawVarint32 <= i10 - i11) {
                    String str = new String(this.buffer, i11, rawVarint32, a0.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.limit;
                int i11 = this.pos;
                if (rawVarint32 <= i10 - i11) {
                    String strDecodeUtf8 = w1.decodeUtf8(this.buffer, i11, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (x1.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.j
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.j
        @Deprecated
        public void readUnknownGroup(int i10, s0.a aVar) throws InvalidProtocolBufferException {
            readGroup(i10, aVar, p.getEmptyRegistry());
        }

        @Override // com.google.protobuf.j
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.j
        public boolean skipField(int i10) throws InvalidProtocolBufferException {
            int tagWireType = x1.getTagWireType(i10);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(x1.makeTag(x1.getTagFieldNumber(i10), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.j
        public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int i11 = this.limit;
                int i12 = this.pos;
                if (i10 <= i11 - i12) {
                    this.pos = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i11 + i10;
            this.pos = i10;
            this.startPos = i10;
            this.immutable = z10;
        }

        @Override // com.google.protobuf.j
        public <T extends s0> T readGroup(int i10, c1 c1Var, p pVar) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T t10 = (T) c1Var.parsePartialFrom(this, pVar);
            checkLastTagWas(x1.makeTag(i10, 4));
            this.recursionDepth--;
            return t10;
        }

        @Override // com.google.protobuf.j
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = x1.getTagWireType(i10);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                i bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int iMakeTag = x1.makeTag(x1.getTagFieldNumber(i10), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.j
        public <T extends s0> T readMessage(c1 c1Var, p pVar) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T t10 = (T) c1Var.parsePartialFrom(this, pVar);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t10;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends j {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if (i11 < 0 || i11 > remaining()) {
                if (i11 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i12, (int) currentRemaining());
                long j10 = iMin;
                v1.copyMemory(this.currentByteBufferPos, bArr, (i11 - i12) + i10, j10);
                i12 -= iMin;
                this.currentByteBufferPos += j10;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i10 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i10;
            int i11 = i10 - this.startOffset;
            int i12 = this.currentLimit;
            if (i11 <= i12) {
                this.bufferSizeAfterCurrentLimit = 0;
                return;
            }
            int i13 = i11 - i12;
            this.bufferSizeAfterCurrentLimit = i13;
            this.totalBufferSize = i10 - i13;
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(int i10, int i11) {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i10);
                    byteBuffer.limit(i11);
                    ByteBuffer byteBufferSlice = this.currentByteBuffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = v1.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // com.google.protobuf.j
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.lastTag != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.j
        public void enableAliasing(boolean z10) {
            this.enableAliasing = z10;
        }

        @Override // com.google.protobuf.j
        public int getBytesUntilLimit() {
            int i10 = this.currentLimit;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.j
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.j
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.j
        public boolean isAtEnd() {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.j
        public void popLimit(int i10) {
            this.currentLimit = i10;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.j
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i10 + getTotalBytesRead();
            int i11 = this.currentLimit;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i11;
        }

        @Override // com.google.protobuf.j
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.j
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.j
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                if (j10 <= currentRemaining()) {
                    if (this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[rawVarint32];
                        v1.copyMemory(this.currentByteBufferPos, bArr, 0L, j10);
                        this.currentByteBufferPos += j10;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j11 = this.currentByteBufferPos + j10;
                    this.currentByteBufferPos = j11;
                    long j12 = this.currentAddress;
                    return slice((int) ((j11 - j12) - j10), (int) (j11 - j12));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return a0.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public i readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.currentByteBufferLimit;
                long j12 = this.currentByteBufferPos;
                if (j10 <= j11 - j12) {
                    if (this.immutable && this.enableAliasing) {
                        int i10 = (int) (j12 - this.currentAddress);
                        i iVarWrap = i.wrap(slice(i10, rawVarint32 + i10));
                        this.currentByteBufferPos += j10;
                        return iVarWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    v1.copyMemory(j12, bArr, 0L, j10);
                    this.currentByteBufferPos += j10;
                    return i.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return i.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable || !this.enableAliasing) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return i.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i11 = (int) (this.currentByteBufferPos - this.currentAddress);
                arrayList.add(i.wrap(slice(i11, i11 + iMin)));
                rawVarint32 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
            return i.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.j
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.j
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.j
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.j
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.j
        public void readGroup(int i10, s0.a aVar, p pVar) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            aVar.mergeFrom(this, pVar);
            checkLastTagWas(x1.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.j
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.j
        public void readMessage(s0.a aVar, p pVar) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            aVar.mergeFrom(this, pVar);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.j
        public byte readRawByte() throws InvalidProtocolBufferException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j10 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j10;
            return v1.getByte(j10);
        }

        @Override // com.google.protobuf.j
        public byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                long j10 = i10;
                if (j10 <= currentRemaining()) {
                    byte[] bArr = new byte[i10];
                    v1.copyMemory(this.currentByteBufferPos, bArr, 0L, j10);
                    this.currentByteBufferPos += j10;
                    return bArr;
                }
            }
            if (i10 >= 0 && i10 <= remaining()) {
                byte[] bArr2 = new byte[i10];
                readRawBytesTo(bArr2, 0, i10);
                return bArr2;
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                return a0.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.j
        public int readRawLittleEndian32() {
            if (currentRemaining() < 4) {
                return (readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readRawByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
            }
            long j10 = this.currentByteBufferPos;
            this.currentByteBufferPos = 4 + j10;
            return ((v1.getByte(j10 + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (v1.getByte(j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((v1.getByte(1 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((v1.getByte(2 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // com.google.protobuf.j
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            char c10;
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j10 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j10;
                c10 = '8';
                rawByte = (((long) v1.getByte(j10)) & 255) | ((((long) v1.getByte(1 + j10)) & 255) << 8) | ((((long) v1.getByte(2 + j10)) & 255) << 16) | ((((long) v1.getByte(3 + j10)) & 255) << 24) | ((((long) v1.getByte(4 + j10)) & 255) << 32) | ((((long) v1.getByte(5 + j10)) & 255) << 40) | ((((long) v1.getByte(6 + j10)) & 255) << 48);
                rawByte2 = v1.getByte(j10 + 7);
            } else {
                c10 = '8';
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return rawByte | ((((long) rawByte2) & 255) << c10);
        }

        @Override // com.google.protobuf.j
        public int readRawVarint32() {
            int i10;
            long j10 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j10) {
                long j11 = j10 + 1;
                byte b10 = v1.getByte(j10);
                if (b10 >= 0) {
                    this.currentByteBufferPos++;
                    return b10;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j12 = 2 + j10;
                    int i11 = (v1.getByte(j11) << 7) ^ b10;
                    if (i11 < 0) {
                        i10 = i11 ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int i12 = (v1.getByte(j12) << 14) ^ i11;
                        if (i12 >= 0) {
                            i10 = i12 ^ 16256;
                        } else {
                            long j14 = 4 + j10;
                            int i13 = i12 ^ (v1.getByte(j13) << 21);
                            if (i13 < 0) {
                                i10 = (-2080896) ^ i13;
                            } else {
                                j13 = 5 + j10;
                                byte b11 = v1.getByte(j14);
                                int i14 = (i13 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    j14 = 6 + j10;
                                    if (v1.getByte(j13) < 0) {
                                        j13 = 7 + j10;
                                        if (v1.getByte(j14) < 0) {
                                            j14 = 8 + j10;
                                            if (v1.getByte(j13) < 0) {
                                                j13 = 9 + j10;
                                                if (v1.getByte(j14) < 0) {
                                                    long j15 = j10 + 10;
                                                    if (v1.getByte(j13) >= 0) {
                                                        i10 = i14;
                                                        j12 = j15;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i14;
                                }
                                i10 = i14;
                            }
                            j12 = j14;
                        }
                        j12 = j13;
                    }
                    this.currentByteBufferPos = j12;
                    return i10;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.j
        public long readRawVarint64() {
            long j10;
            long j11;
            long j12;
            long j13 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j13) {
                long j14 = j13 + 1;
                byte b10 = v1.getByte(j13);
                if (b10 >= 0) {
                    this.currentByteBufferPos++;
                    return b10;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j15 = 2 + j13;
                    int i10 = (v1.getByte(j14) << 7) ^ b10;
                    if (i10 < 0) {
                        j10 = i10 ^ (-128);
                    } else {
                        long j16 = 3 + j13;
                        int i11 = (v1.getByte(j15) << 14) ^ i10;
                        if (i11 >= 0) {
                            j10 = i11 ^ 16256;
                            j15 = j16;
                        } else {
                            long j17 = 4 + j13;
                            int i12 = i11 ^ (v1.getByte(j16) << 21);
                            if (i12 < 0) {
                                j10 = (-2080896) ^ i12;
                                j15 = j17;
                            } else {
                                long j18 = 5 + j13;
                                long j19 = (((long) v1.getByte(j17)) << 28) ^ ((long) i12);
                                if (j19 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j20 = 6 + j13;
                                    long j21 = j19 ^ (((long) v1.getByte(j18)) << 35);
                                    if (j21 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j18 = 7 + j13;
                                        j19 = j21 ^ (((long) v1.getByte(j20)) << 42);
                                        if (j19 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j20 = 8 + j13;
                                            j21 = j19 ^ (((long) v1.getByte(j18)) << 49);
                                            if (j21 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j18 = 9 + j13;
                                                long j22 = (j21 ^ (((long) v1.getByte(j20)) << 56)) ^ 71499008037633920L;
                                                if (j22 < 0) {
                                                    long j23 = j13 + 10;
                                                    if (v1.getByte(j18) >= 0) {
                                                        j15 = j23;
                                                        j10 = j22;
                                                    }
                                                } else {
                                                    j10 = j22;
                                                    j15 = j18;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ j21;
                                    j15 = j20;
                                }
                                j10 = j12 ^ j19;
                                j15 = j18;
                            }
                        }
                    }
                    this.currentByteBufferPos = j15;
                    return j10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.j
        long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.j
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.j
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.j
        public int readSInt32() {
            return j.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.j
        public long readSInt64() {
            return j.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.j
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.currentByteBufferLimit;
                long j12 = this.currentByteBufferPos;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[rawVarint32];
                    v1.copyMemory(j12, bArr, 0L, j10);
                    String str = new String(bArr, a0.UTF_8);
                    this.currentByteBufferPos += j10;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, a0.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.currentByteBufferLimit;
                long j12 = this.currentByteBufferPos;
                if (j10 <= j11 - j12) {
                    String strDecodeUtf8 = w1.decodeUtf8(this.currentByteBuffer, (int) (j12 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j10;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return w1.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (x1.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.j
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.j
        @Deprecated
        public void readUnknownGroup(int i10, s0.a aVar) throws InvalidProtocolBufferException {
            readGroup(i10, aVar, p.getEmptyRegistry());
        }

        @Override // com.google.protobuf.j
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.j
        public boolean skipField(int i10) throws InvalidProtocolBufferException {
            int tagWireType = x1.getTagWireType(i10);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(x1.makeTag(x1.getTagFieldNumber(i10), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.j
        public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0 || i10 > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i10 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i10, (int) currentRemaining());
                i10 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
        }

        private c(Iterable<ByteBuffer> iterable, int i10, boolean z10) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i10;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z10;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i10 != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.currentByteBuffer = a0.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
        }

        @Override // com.google.protobuf.j
        public <T extends s0> T readGroup(int i10, c1 c1Var, p pVar) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T t10 = (T) c1Var.parsePartialFrom(this, pVar);
            checkLastTagWas(x1.makeTag(i10, 4));
            this.recursionDepth--;
            return t10;
        }

        @Override // com.google.protobuf.j
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = x1.getTagWireType(i10);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                i bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int iMakeTag = x1.makeTag(x1.getTagFieldNumber(i10), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.j
        public <T extends s0> T readMessage(c1 c1Var, p pVar) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T t10 = (T) c1Var.parsePartialFrom(this, pVar);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t10;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends j {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private a refillCallback;
        private int totalBytesRetired;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private interface a {
        }

        private static int available(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private static int read(InputStream inputStream, byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private i readBytesSlowPath(int i10) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i10);
            if (rawBytesSlowPathOneChunk != null) {
                return i.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i11 = this.pos;
            int i12 = this.bufferSize;
            int length = i12 - i11;
            this.totalBytesRetired += i12;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, i11, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return i.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(int i10, boolean z10) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i10);
            if (rawBytesSlowPathOneChunk != null) {
                return z10 ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i11 = this.pos;
            int i12 = this.bufferSize;
            int length = i12 - i11;
            this.totalBytesRetired += i12;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, i11, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i10) throws InvalidProtocolBufferException {
            if (i10 == 0) {
                return a0.EMPTY_BYTE_ARRAY;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = this.totalBytesRetired;
            int i12 = this.pos;
            int i13 = i11 + i12 + i10;
            if (i13 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i14 = this.currentLimit;
            if (i13 > i14) {
                skipRawBytes((i14 - i11) - i12);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i15 = this.bufferSize - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i15);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i15 < i10) {
                int i17 = read(this.input, bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i17;
                i15 += i17;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.input.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i10 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i10;
            int i11 = this.totalBytesRetired + i10;
            int i12 = this.currentLimit;
            if (i11 <= i12) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i13 = i11 - i12;
            this.bufferSizeAfterLimit = i13;
            this.bufferSize = i10 - i13;
        }

        private void refillBuffer(int i10) throws InvalidProtocolBufferException {
            if (tryRefillBuffer(i10)) {
                return;
            }
            if (i10 <= (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long skip(InputStream inputStream, long j10) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private void skipRawBytesSlowPath(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = this.totalBytesRetired;
            int i12 = this.pos;
            int i13 = i11 + i12 + i10;
            int i14 = this.currentLimit;
            if (i13 > i14) {
                skipRawBytes((i14 - i11) - i12);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.totalBytesRetired = i11 + i12;
            int i15 = this.bufferSize - i12;
            this.bufferSize = 0;
            this.pos = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jSkip = skip(this.input, j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i15 += (int) jSkip;
                    }
                } catch (Throwable th2) {
                    this.totalBytesRetired += i15;
                    recomputeBufferSizeAfterLimit();
                    throw th2;
                }
            }
            this.totalBytesRetired += i15;
            recomputeBufferSizeAfterLimit();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.bufferSize;
            int i17 = i16 - this.pos;
            this.pos = i16;
            refillBuffer(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.bufferSize;
                if (i18 <= i19) {
                    this.pos = i18;
                    return;
                } else {
                    i17 += i19;
                    this.pos = i19;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.buffer;
                int i11 = this.pos;
                this.pos = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean tryRefillBuffer(int i10) throws InvalidProtocolBufferException {
            int i11 = this.pos;
            int i12 = i11 + i10;
            int i13 = this.bufferSize;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.sizeLimit;
            int i15 = this.totalBytesRetired;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.currentLimit) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.totalBytesRetired += i11;
                this.bufferSize -= i11;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i16 = this.bufferSize;
            int i17 = read(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.sizeLimit - this.totalBytesRetired) - i16));
            if (i17 == 0 || i17 < -1 || i17 > this.buffer.length) {
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.bufferSize += i17;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= i10) {
                return true;
            }
            return tryRefillBuffer(i10);
        }

        @Override // com.google.protobuf.j
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.lastTag != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.j
        public int getBytesUntilLimit() {
            int i10 = this.currentLimit;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.j
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.j
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // com.google.protobuf.j
        public boolean isAtEnd() {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.j
        public void popLimit(int i10) {
            this.currentLimit = i10;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.j
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = i10 + this.totalBytesRetired + this.pos;
            int i12 = this.currentLimit;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i11;
            recomputeBufferSizeAfterLimit();
            return i12;
        }

        @Override // com.google.protobuf.j
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.j
        public byte[] readByteArray() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.bufferSize;
            int i11 = this.pos;
            if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return readRawBytesSlowPath(rawVarint32, false);
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i11, i11 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.protobuf.j
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.bufferSize;
            int i11 = this.pos;
            if (rawVarint32 <= i10 - i11 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i11, i11 + rawVarint32));
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return a0.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.j
        public i readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.bufferSize;
            int i11 = this.pos;
            if (rawVarint32 <= i10 - i11 && rawVarint32 > 0) {
                i iVarCopyFrom = i.copyFrom(this.buffer, i11, rawVarint32);
                this.pos += rawVarint32;
                return iVarCopyFrom;
            }
            if (rawVarint32 == 0) {
                return i.EMPTY;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.j
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.j
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.j
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.j
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.j
        public void readGroup(int i10, s0.a aVar, p pVar) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            aVar.mergeFrom(this, pVar);
            checkLastTagWas(x1.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.j
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.j
        public void readMessage(s0.a aVar, p pVar) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            aVar.mergeFrom(this, pVar);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.j
        public byte readRawByte() throws InvalidProtocolBufferException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i10 = this.pos;
            this.pos = i10 + 1;
            return bArr[i10];
        }

        @Override // com.google.protobuf.j
        public byte[] readRawBytes(int i10) {
            int i11 = this.pos;
            if (i10 > this.bufferSize - i11 || i10 <= 0) {
                return readRawBytesSlowPath(i10, false);
            }
            int i12 = i10 + i11;
            this.pos = i12;
            return Arrays.copyOfRange(this.buffer, i11, i12);
        }

        @Override // com.google.protobuf.j
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            int i10 = this.pos;
            if (this.bufferSize - i10 < 4) {
                refillBuffer(4);
                i10 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i10 + 4;
            return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // com.google.protobuf.j
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            int i10 = this.pos;
            if (this.bufferSize - i10 < 8) {
                refillBuffer(8);
                i10 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.j
        public int readRawVarint32() {
            int i10;
            int i11 = this.pos;
            int i12 = this.bufferSize;
            if (i12 != i11) {
                byte[] bArr = this.buffer;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.pos = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.pos = i14;
                    return i10;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.j
        public long readRawVarint64() {
            long j10;
            long j11;
            long j12;
            int i10 = this.pos;
            int i11 = this.bufferSize;
            if (i11 != i10) {
                byte[] bArr = this.buffer;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.pos = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.pos = i13;
                    return j10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.j
        long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.j
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.j
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.j
        public int readSInt32() {
            return j.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.j
        public long readSInt64() {
            return j.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.j
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.bufferSize;
                int i11 = this.pos;
                if (rawVarint32 <= i10 - i11) {
                    String str = new String(this.buffer, i11, rawVarint32, a0.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (rawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(rawVarint32, false), a0.UTF_8);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.buffer, this.pos, rawVarint32, a0.UTF_8);
            this.pos += rawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.j
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i10 = this.pos;
            int i11 = this.bufferSize;
            if (rawVarint32 <= i11 - i10 && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i10 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i10 = 0;
                if (rawVarint32 <= i11) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return w1.decodeUtf8(rawBytesSlowPath, i10, rawVarint32);
        }

        @Override // com.google.protobuf.j
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (x1.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.j
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.j
        @Deprecated
        public void readUnknownGroup(int i10, s0.a aVar) throws InvalidProtocolBufferException {
            readGroup(i10, aVar, p.getEmptyRegistry());
        }

        @Override // com.google.protobuf.j
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.j
        public boolean skipField(int i10) throws InvalidProtocolBufferException {
            int tagWireType = x1.getTagWireType(i10);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(x1.makeTag(x1.getTagFieldNumber(i10), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.j
        public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
            int i11 = this.bufferSize;
            int i12 = this.pos;
            if (i10 > i11 - i12 || i10 < 0) {
                skipRawBytesSlowPath(i10);
            } else {
                this.pos = i12 + i10;
            }
        }

        private d(InputStream inputStream, int i10) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            a0.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i10];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        @Override // com.google.protobuf.j
        public <T extends s0> T readGroup(int i10, c1 c1Var, p pVar) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T t10 = (T) c1Var.parsePartialFrom(this, pVar);
            checkLastTagWas(x1.makeTag(i10, 4));
            this.recursionDepth--;
            return t10;
        }

        @Override // com.google.protobuf.j
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = x1.getTagWireType(i10);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                i bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int iMakeTag = x1.makeTag(x1.getTagFieldNumber(i10), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.j
        public <T extends s0> T readMessage(c1 c1Var, p pVar) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T t10 = (T) c1Var.parsePartialFrom(this, pVar);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t10;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public void enableAliasing(boolean z10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e extends j {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private int bufferPos(long j10) {
            return (int) (j10 - this.address);
        }

        static boolean isSupported() {
            return v1.hasUnsafeByteBufferOperations();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j10 = this.limit + ((long) this.bufferSizeAfterLimit);
            this.limit = j10;
            int i10 = (int) (j10 - this.startPos);
            int i11 = this.currentLimit;
            if (i10 <= i11) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i12 = i10 - i11;
            this.bufferSizeAfterLimit = i12;
            this.limit = j10 - ((long) i12);
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.pos;
                this.pos = 1 + j10;
                if (v1.getByte(j10) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(long j10, long j11) {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j10));
                    byteBuffer.limit(bufferPos(j11));
                    ByteBuffer byteBufferSlice = this.buffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e10) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e10);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        @Override // com.google.protobuf.j
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.lastTag != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.j
        public void enableAliasing(boolean z10) {
            this.enableAliasing = z10;
        }

        @Override // com.google.protobuf.j
        public int getBytesUntilLimit() {
            int i10 = this.currentLimit;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.j
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.j
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.j
        public boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.j
        public void popLimit(int i10) {
            this.currentLimit = i10;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.j
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i10 + getTotalBytesRead();
            int i11 = this.currentLimit;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i11;
        }

        @Override // com.google.protobuf.j
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.j
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.j
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return a0.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[rawVarint32];
                long j10 = rawVarint32;
                v1.copyMemory(this.pos, bArr, 0L, j10);
                this.pos += j10;
                return ByteBuffer.wrap(bArr);
            }
            long j11 = this.pos;
            long j12 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j11, j11 + j12);
            this.pos += j12;
            return byteBufferSlice;
        }

        @Override // com.google.protobuf.j
        public i readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return i.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j10 = this.pos;
                long j11 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j10, j10 + j11);
                this.pos += j11;
                return i.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j12 = rawVarint32;
            v1.copyMemory(this.pos, bArr, 0L, j12);
            this.pos += j12;
            return i.wrap(bArr);
        }

        @Override // com.google.protobuf.j
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.j
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.j
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.j
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.j
        public void readGroup(int i10, s0.a aVar, p pVar) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            aVar.mergeFrom(this, pVar);
            checkLastTagWas(x1.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.j
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.j
        public void readMessage(s0.a aVar, p pVar) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            aVar.mergeFrom(this, pVar);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.j
        public byte readRawByte() throws InvalidProtocolBufferException {
            long j10 = this.pos;
            if (j10 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j10;
            return v1.getByte(j10);
        }

        @Override // com.google.protobuf.j
        public byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0 || i10 > remaining()) {
                if (i10 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i10 == 0) {
                    return a0.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i10];
            long j10 = this.pos;
            long j11 = i10;
            slice(j10, j10 + j11).get(bArr);
            this.pos += j11;
            return bArr;
        }

        @Override // com.google.protobuf.j
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            long j10 = this.pos;
            if (this.limit - j10 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j10;
            return ((v1.getByte(j10 + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (v1.getByte(j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((v1.getByte(1 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((v1.getByte(2 + j10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // com.google.protobuf.j
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            long j10 = this.pos;
            if (this.limit - j10 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j10;
            return ((((long) v1.getByte(j10 + 7)) & 255) << 56) | (((long) v1.getByte(j10)) & 255) | ((((long) v1.getByte(1 + j10)) & 255) << 8) | ((((long) v1.getByte(2 + j10)) & 255) << 16) | ((((long) v1.getByte(3 + j10)) & 255) << 24) | ((((long) v1.getByte(4 + j10)) & 255) << 32) | ((((long) v1.getByte(5 + j10)) & 255) << 40) | ((((long) v1.getByte(6 + j10)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.v1.getByte(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() {
            /*
                r9 = this;
                long r0 = r9.pos
                long r2 = r9.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.v1.getByte(r0)
                if (r4 < 0) goto L16
                r9.pos = r2
                return r4
            L16:
                long r5 = r9.limit
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.v1.getByte(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.v1.getByte(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.v1.getByte(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.v1.getByte(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.v1.getByte(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.v1.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.v1.getByte(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.v1.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.v1.getByte(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.pos = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.e.readRawVarint32():int");
        }

        @Override // com.google.protobuf.j
        public long readRawVarint64() {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.pos;
            if (this.limit != j13) {
                long j14 = 1 + j13;
                byte b10 = v1.getByte(j13);
                if (b10 >= 0) {
                    this.pos = j14;
                    return b10;
                }
                if (this.limit - j14 >= 9) {
                    long j15 = 2 + j13;
                    int i11 = (v1.getByte(j14) << 7) ^ b10;
                    if (i11 >= 0) {
                        long j16 = 3 + j13;
                        int i12 = i11 ^ (v1.getByte(j15) << 14);
                        if (i12 >= 0) {
                            j10 = i12 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int i13 = i12 ^ (v1.getByte(j16) << 21);
                            if (i13 < 0) {
                                i10 = (-2080896) ^ i13;
                            } else {
                                long j17 = 5 + j13;
                                long j18 = ((long) i13) ^ (((long) v1.getByte(j15)) << 28);
                                if (j18 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j19 = 6 + j13;
                                    long j20 = j18 ^ (((long) v1.getByte(j17)) << 35);
                                    if (j20 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        j18 = j20 ^ (((long) v1.getByte(j19)) << 42);
                                        if (j18 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j13;
                                            j20 = j18 ^ (((long) v1.getByte(j17)) << 49);
                                            if (j20 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j21 = j13 + 9;
                                                long j22 = (j20 ^ (((long) v1.getByte(j19)) << 56)) ^ 71499008037633920L;
                                                if (j22 < 0) {
                                                    long j23 = j13 + 10;
                                                    if (v1.getByte(j21) >= 0) {
                                                        j15 = j23;
                                                        j10 = j22;
                                                    }
                                                } else {
                                                    j10 = j22;
                                                    j15 = j21;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ j20;
                                    j15 = j19;
                                }
                                j10 = j12 ^ j18;
                                j15 = j17;
                            }
                        }
                        this.pos = j15;
                        return j10;
                    }
                    i10 = i11 ^ (-128);
                    j10 = i10;
                    this.pos = j15;
                    return j10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.j
        long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.j
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.j
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.j
        public int readSInt32() {
            return j.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.j
        public long readSInt64() {
            return j.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.j
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j10 = rawVarint32;
            v1.copyMemory(this.pos, bArr, 0L, j10);
            String str = new String(bArr, a0.UTF_8);
            this.pos += j10;
            return str;
        }

        @Override // com.google.protobuf.j
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strDecodeUtf8 = w1.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += (long) rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (x1.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.j
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.j
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.j
        @Deprecated
        public void readUnknownGroup(int i10, s0.a aVar) throws InvalidProtocolBufferException {
            readGroup(i10, aVar, p.getEmptyRegistry());
        }

        @Override // com.google.protobuf.j
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.j
        public boolean skipField(int i10) throws InvalidProtocolBufferException {
            int tagWireType = x1.getTagWireType(i10);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(x1.makeTag(x1.getTagFieldNumber(i10), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.j
        public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0 && i10 <= remaining()) {
                this.pos += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        private e(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long jAddressOffset = v1.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            this.limit = ((long) byteBuffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) byteBuffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = z10;
        }

        @Override // com.google.protobuf.j
        public <T extends s0> T readGroup(int i10, c1 c1Var, p pVar) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T t10 = (T) c1Var.parsePartialFrom(this, pVar);
            checkLastTagWas(x1.makeTag(i10, 4));
            this.recursionDepth--;
            return t10;
        }

        @Override // com.google.protobuf.j
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = x1.getTagWireType(i10);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                i bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int iMakeTag = x1.makeTag(x1.getTagFieldNumber(i10), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.j
        public <T extends s0> T readMessage(c1 c1Var, p pVar) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T t10 = (T) c1Var.parsePartialFrom(this, pVar);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return t10;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static j newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i11 |= (i13 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i10);

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z10);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract void popLimit(int i10);

    public abstract int pushLimit(int i10);

    public abstract boolean readBool();

    public abstract byte[] readByteArray();

    public abstract ByteBuffer readByteBuffer();

    public abstract i readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract <T extends s0> T readGroup(int i10, c1 c1Var, p pVar);

    public abstract void readGroup(int i10, s0.a aVar, p pVar);

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract <T extends s0> T readMessage(c1 c1Var, p pVar);

    public abstract void readMessage(s0.a aVar, p pVar);

    public abstract byte readRawByte();

    public abstract byte[] readRawBytes(int i10);

    public abstract int readRawLittleEndian32();

    public abstract long readRawLittleEndian64();

    public abstract int readRawVarint32();

    public abstract long readRawVarint64();

    abstract long readRawVarint64SlowPath();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    @Deprecated
    public abstract void readUnknownGroup(int i10, s0.a aVar);

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.recursionLimit;
            this.recursionLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i10);
    }

    public final int setSizeLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.sizeLimit;
            this.sizeLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i10);

    @Deprecated
    public abstract boolean skipField(int i10, CodedOutputStream codedOutputStream);

    public void skipMessage() throws InvalidProtocolBufferException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public abstract void skipRawBytes(int i10);

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private j() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static j newInstance(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? newInstance(a0.EMPTY_BYTE_ARRAY) : new d(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static j newInstance(Iterable<ByteBuffer> iterable) {
        if (!e.isSupported()) {
            return newInstance(new b0(iterable));
        }
        return newInstance(iterable, false);
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return readRawVarint32(i10, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag, codedOutputStream);
            this.recursionDepth--;
        } while (zSkipField);
    }

    static j newInstance(Iterable<ByteBuffer> iterable, boolean z10) {
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i10 |= 1;
            } else {
                i10 = byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
            }
        }
        if (i10 == 2) {
            return new c(iterable, iRemaining, z10);
        }
        return newInstance(new b0(iterable));
    }

    public static j newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static j newInstance(byte[] bArr, int i10, int i11) {
        return newInstance(bArr, i10, i11, false);
    }

    static j newInstance(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.pushLimit(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static j newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    static j newInstance(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && e.isSupported()) {
            return new e(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }
}
