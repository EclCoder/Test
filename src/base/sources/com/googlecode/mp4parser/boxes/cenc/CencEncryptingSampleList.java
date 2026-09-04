package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import hi.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CencEncryptingSampleList extends AbstractList<Sample> {
    List<a> auxiliaryDataFormats;
    RangeStartMap<Integer, SecretKey> ceks;
    Cipher cipher;
    private final String encryptionAlgo;
    List<Sample> parent;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class EncryptedSampleImpl implements Sample {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final SecretKey cek;
        private final a cencSampleAuxiliaryDataFormat;
        private final Cipher cipher;
        private final Sample clearSample;

        /* synthetic */ EncryptedSampleImpl(CencEncryptingSampleList cencEncryptingSampleList, Sample sample, a aVar, Cipher cipher, SecretKey secretKey, EncryptedSampleImpl encryptedSampleImpl) {
            this(sample, aVar, cipher, secretKey);
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public ByteBuffer asByteBuffer() {
            ByteBuffer byteBuffer = (ByteBuffer) this.clearSample.asByteBuffer().rewind();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit());
            a aVar = this.cencSampleAuxiliaryDataFormat;
            CencEncryptingSampleList.this.initCipher(aVar.f40373a, this.cek);
            try {
                a.j[] jVarArr = aVar.f40374b;
                if (jVarArr != null) {
                    for (a.j jVar : jVarArr) {
                        byte[] bArr = new byte[jVar.clear()];
                        byteBuffer.get(bArr);
                        byteBufferAllocate.put(bArr);
                        if (jVar.a() > 0) {
                            byte[] bArr2 = new byte[CastUtils.l2i(jVar.a())];
                            byteBuffer.get(bArr2);
                            byteBufferAllocate.put(this.cipher.update(bArr2));
                        }
                    }
                } else {
                    int iLimit = byteBuffer.limit();
                    byte[] bArr3 = new byte[iLimit];
                    byteBuffer.get(bArr3);
                    if (C.CENC_TYPE_cbc1.equals(CencEncryptingSampleList.this.encryptionAlgo)) {
                        int i10 = (iLimit / 16) * 16;
                        byteBufferAllocate.put(this.cipher.doFinal(bArr3, 0, i10));
                        byteBufferAllocate.put(bArr3, i10, iLimit - i10);
                    } else if (C.CENC_TYPE_cenc.equals(CencEncryptingSampleList.this.encryptionAlgo)) {
                        byteBufferAllocate.put(this.cipher.doFinal(bArr3));
                    }
                }
                byteBuffer.rewind();
                byteBufferAllocate.rewind();
                return byteBufferAllocate;
            } catch (BadPaddingException e10) {
                throw new RuntimeException(e10);
            } catch (IllegalBlockSizeException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public long getSize() {
            return this.clearSample.getSize();
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public void writeTo(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer byteBuffer = (ByteBuffer) this.clearSample.asByteBuffer().rewind();
            CencEncryptingSampleList.this.initCipher(this.cencSampleAuxiliaryDataFormat.f40373a, this.cek);
            try {
                a.j[] jVarArr = this.cencSampleAuxiliaryDataFormat.f40374b;
                if (jVarArr == null || jVarArr.length <= 0) {
                    int iLimit = byteBuffer.limit();
                    byte[] bArr = new byte[iLimit];
                    byteBuffer.get(bArr);
                    if (C.CENC_TYPE_cbc1.equals(CencEncryptingSampleList.this.encryptionAlgo)) {
                        int i10 = (iLimit / 16) * 16;
                        writableByteChannel.write(ByteBuffer.wrap(this.cipher.doFinal(bArr, 0, i10)));
                        writableByteChannel.write(ByteBuffer.wrap(bArr, i10, iLimit - i10));
                    } else if (C.CENC_TYPE_cenc.equals(CencEncryptingSampleList.this.encryptionAlgo)) {
                        writableByteChannel.write(ByteBuffer.wrap(this.cipher.doFinal(bArr)));
                    }
                } else {
                    byte[] bArr2 = new byte[byteBuffer.limit()];
                    byteBuffer.get(bArr2);
                    int iA = 0;
                    for (a.j jVar : this.cencSampleAuxiliaryDataFormat.f40374b) {
                        int iClear = jVar.clear() + iA;
                        if (jVar.a() > 0) {
                            this.cipher.update(bArr2, iClear, CastUtils.l2i(jVar.a()), bArr2, iClear);
                            iA = (int) (((long) iClear) + jVar.a());
                        } else {
                            iA = iClear;
                        }
                    }
                    writableByteChannel.write(ByteBuffer.wrap(bArr2));
                }
                byteBuffer.rewind();
            } catch (BadPaddingException e10) {
                throw new RuntimeException(e10);
            } catch (IllegalBlockSizeException e11) {
                throw new RuntimeException(e11);
            } catch (ShortBufferException e12) {
                throw new RuntimeException(e12);
            }
        }

        private EncryptedSampleImpl(Sample sample, a aVar, Cipher cipher, SecretKey secretKey) {
            this.clearSample = sample;
            this.cencSampleAuxiliaryDataFormat = aVar;
            this.cipher = cipher;
            this.cek = secretKey;
        }
    }

    public CencEncryptingSampleList(SecretKey secretKey, List<Sample> list, List<a> list2) {
        this(new RangeStartMap(0, secretKey), list, list2, C.CENC_TYPE_cenc);
    }

    protected void initCipher(byte[] bArr, SecretKey secretKey) {
        try {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.cipher.init(1, secretKey, new IvParameterSpec(bArr2));
        } catch (InvalidAlgorithmParameterException e10) {
            throw new RuntimeException(e10);
        } catch (InvalidKeyException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.parent.size();
    }

    public CencEncryptingSampleList(RangeStartMap<Integer, SecretKey> rangeStartMap, List<Sample> list, List<a> list2, String str) {
        new RangeStartMap();
        this.auxiliaryDataFormats = list2;
        this.ceks = rangeStartMap;
        this.encryptionAlgo = str;
        this.parent = list;
        try {
            if (C.CENC_TYPE_cenc.equals(str)) {
                this.cipher = Cipher.getInstance("AES/CTR/NoPadding");
            } else {
                if (!C.CENC_TYPE_cbc1.equals(str)) {
                    throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
                }
                this.cipher = Cipher.getInstance("AES/CBC/NoPadding");
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Sample get(int i10) {
        Sample sample = this.parent.get(i10);
        return this.ceks.get(Integer.valueOf(i10)) != null ? new EncryptedSampleImpl(this, sample, this.auxiliaryDataFormats.get(i10), this.cipher, this.ceks.get(Integer.valueOf(i10)), null) : sample;
    }
}
