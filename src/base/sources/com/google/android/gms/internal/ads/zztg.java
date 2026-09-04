package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zztg extends zzcp {
    private zzhaf zzd;
    private zzhaf zze;

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        zzhaf zzhafVar = this.zze;
        zzhafVar.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzk = zzk(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i15 = 0; i15 < zzhafVar.zzh(); i15++) {
                int iZzG = (zzfl.zzG(this.zzb.zzd) * zzhafVar.zzi(i15)) + iPosition;
                int i16 = this.zzb.zzd;
                if (i16 == 2) {
                    byteBufferZzk.putShort(byteBuffer.getShort(iZzG));
                } else if (i16 == 3) {
                    byteBufferZzk.put(byteBuffer.get(iZzG));
                } else if (i16 == 4) {
                    byteBufferZzk.putFloat(byteBuffer.getFloat(iZzG));
                } else if (i16 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i10 = iZzG;
                    } else {
                        i10 = iZzG + 2;
                    }
                    byte b10 = byteBuffer.get(i10);
                    byte b11 = byteBuffer.get(iZzG + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iZzG += 2;
                    }
                    i11 = ((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680) | ((byteBuffer.get(iZzG) << 8) & 65280);
                    i12 = i11 >> 8;
                    if ((i12 & (-16777216)) != 0 || (i12 & (-8388608)) == -8388608) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zzgtj.zzf(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i12));
                    zzgtj.zza(byteBufferZzk.remaining() >= 3);
                    if (byteBufferZzk.order() == byteOrder) {
                        i13 = (i11 >> 24) & 255;
                    } else {
                        i13 = i12 & 255;
                    }
                    byte b12 = (byte) i13;
                    int i17 = (i11 >> 16) & 255;
                    if (byteBufferZzk.order() == byteOrder) {
                        i14 = i12 & 255;
                    } else {
                        i14 = (i11 >> 24) & 255;
                    }
                    byteBufferZzk.put(b12).put((byte) i17).put((byte) i14);
                } else if (i16 == 22) {
                    byteBufferZzk.putInt(byteBuffer.getInt(iZzG));
                } else if (i16 == 268435456) {
                    byteBufferZzk.putShort(byteBuffer.getShort(iZzG));
                } else if (i16 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i10 = iZzG;
                    } else {
                        i10 = iZzG + 2;
                    }
                    byte b13 = byteBuffer.get(i10);
                    byte b14 = byteBuffer.get(iZzG + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iZzG += 2;
                    }
                    i11 = ((b13 << 24) & (-16777216)) | ((b14 << 16) & 16711680) | ((byteBuffer.get(iZzG) << 8) & 65280);
                    i12 = i11 >> 8;
                    if ((i12 & (-16777216)) != 0) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    zzgtj.zzf(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i12));
                    zzgtj.zza(byteBufferZzk.remaining() >= 3);
                    if (byteBufferZzk.order() == byteOrder) {
                        i13 = (i11 >> 24) & 255;
                    } else {
                        i13 = i12 & 255;
                    }
                    byte b15 = (byte) i13;
                    int i18 = (i11 >> 16) & 255;
                    if (byteBufferZzk.order() == byteOrder) {
                        i14 = i12 & 255;
                    } else {
                        i14 = (i11 >> 24) & 255;
                    }
                    byteBufferZzk.put(b15).put((byte) i18).put((byte) i14);
                } else if (i16 == 1610612736) {
                    byteBufferZzk.putInt(byteBuffer.getInt(iZzG));
                } else {
                    if (i16 != 1879048192) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i16).length() + 21);
                        sb2.append("Unexpected encoding: ");
                        sb2.append(i16);
                        throw new IllegalStateException(sb2.toString());
                    }
                    byteBufferZzk.putDouble(byteBuffer.getDouble(iZzG));
                }
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        zzhaf zzhafVar = this.zzd;
        if (zzhafVar == null) {
            return zzcl.zza;
        }
        int i10 = zzclVar.zzd;
        if (!zzfl.zzD(i10)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int iZzh = zzhafVar.zzh();
        int i11 = zzclVar.zzc;
        boolean z10 = i11 != iZzh;
        int i12 = 0;
        while (i12 < iZzh) {
            int iZzi = zzhafVar.zzi(i12);
            if (iZzi >= i11) {
                String string = zzhafVar.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 59);
                sb2.append("Channel map (");
                sb2.append(string);
                sb2.append(") trying to access non-existent input channel.");
                throw new zzcn(sb2.toString(), zzclVar);
            }
            z10 |= iZzi != i12;
            i12++;
        }
        return z10 ? new zzcl(zzclVar.zzb, iZzh, i10) : zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzo(zzcm zzcmVar) {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(zzhaf zzhafVar) {
        this.zzd = zzhafVar;
    }
}
