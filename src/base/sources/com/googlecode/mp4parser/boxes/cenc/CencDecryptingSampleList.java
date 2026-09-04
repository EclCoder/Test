package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import hi.a;
import java.nio.ByteBuffer;
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
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CencDecryptingSampleList extends AbstractList<Sample> {
    String encryptionAlgo;
    RangeStartMap<Integer, SecretKey> keys;
    List<Sample> parent;
    List<a> sencInfo;

    public CencDecryptingSampleList(SecretKey secretKey, List<Sample> list, List<a> list2) {
        this(new RangeStartMap(0, secretKey), list, list2, C.CENC_TYPE_cenc);
    }

    Cipher getCipher(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        try {
            if (C.CENC_TYPE_cenc.equals(this.encryptionAlgo)) {
                Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher.init(2, secretKey, new IvParameterSpec(bArr2));
                return cipher;
            }
            if (!C.CENC_TYPE_cbc1.equals(this.encryptionAlgo)) {
                throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
            }
            Cipher cipher2 = Cipher.getInstance("AES/CBC/NoPadding");
            cipher2.init(2, secretKey, new IvParameterSpec(bArr2));
            return cipher2;
        } catch (InvalidAlgorithmParameterException e10) {
            throw new RuntimeException(e10);
        } catch (InvalidKeyException e11) {
            throw new RuntimeException(e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new RuntimeException(e12);
        } catch (NoSuchPaddingException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.parent.size();
    }

    public CencDecryptingSampleList(RangeStartMap<Integer, SecretKey> rangeStartMap, List<Sample> list, List<a> list2, String str) {
        new RangeStartMap();
        this.sencInfo = list2;
        this.keys = rangeStartMap;
        this.parent = list;
        this.encryptionAlgo = str;
    }

    @Override // java.util.AbstractList, java.util.List
    public Sample get(int i10) {
        if (this.keys.get(Integer.valueOf(i10)) == null) {
            return this.parent.get(i10);
        }
        Sample sample = this.parent.get(i10);
        ByteBuffer byteBufferAsByteBuffer = sample.asByteBuffer();
        byteBufferAsByteBuffer.rewind();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferAsByteBuffer.limit());
        a aVar = this.sencInfo.get(i10);
        Cipher cipher = getCipher(this.keys.get(Integer.valueOf(i10)), aVar.f40373a);
        try {
            a.j[] jVarArr = aVar.f40374b;
            if (jVarArr == null || jVarArr.length <= 0) {
                int iLimit = byteBufferAsByteBuffer.limit();
                byte[] bArr = new byte[iLimit];
                byteBufferAsByteBuffer.get(bArr);
                if (C.CENC_TYPE_cbc1.equals(this.encryptionAlgo)) {
                    int i11 = (iLimit / 16) * 16;
                    byteBufferAllocate.put(cipher.doFinal(bArr, 0, i11));
                    byteBufferAllocate.put(bArr, i11, iLimit - i11);
                } else if (C.CENC_TYPE_cenc.equals(this.encryptionAlgo)) {
                    byteBufferAllocate.put(cipher.doFinal(bArr));
                }
            } else {
                for (a.j jVar : jVarArr) {
                    int iClear = jVar.clear();
                    int iL2i = CastUtils.l2i(jVar.a());
                    byte[] bArr2 = new byte[iClear];
                    byteBufferAsByteBuffer.get(bArr2);
                    byteBufferAllocate.put(bArr2);
                    if (iL2i > 0) {
                        byte[] bArr3 = new byte[iL2i];
                        byteBufferAsByteBuffer.get(bArr3);
                        byteBufferAllocate.put(cipher.update(bArr3));
                    }
                }
                if (byteBufferAsByteBuffer.remaining() > 0) {
                    System.err.println("Decrypted sample but still data remaining: " + sample.getSize());
                }
                byteBufferAllocate.put(cipher.doFinal());
            }
            byteBufferAsByteBuffer.rewind();
            byteBufferAllocate.rewind();
            return new SampleImpl(byteBufferAllocate);
        } catch (BadPaddingException e10) {
            throw new RuntimeException(e10);
        } catch (IllegalBlockSizeException e11) {
            throw new RuntimeException(e11);
        }
    }
}
