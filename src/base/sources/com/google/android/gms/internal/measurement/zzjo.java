package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjp();
    public final String zza;
    final long zzb;
    final boolean zzc;
    final double zzd;
    final String zze;
    final byte[] zzf;
    public final int zzg;
    public final int zzh;
    private final int zzi;

    zzjo(String str, long j10, boolean z10, double d10, String str2, byte[] bArr, int i10, int i11, int i12) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = z10;
        this.zzd = d10;
        this.zze = str2;
        this.zzf = bArr;
        this.zzg = i10;
        this.zzh = i11;
        this.zzi = i12;
    }

    private static int zzg(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 != i11 ? 1 : 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zzjo zzjoVar) {
        zzjo zzjoVar2 = zzjoVar;
        int iCompareTo = this.zza.compareTo(zzjoVar2.zza);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i10 = this.zzg;
        int iZzg = zzg(i10, zzjoVar2.zzg);
        if (iZzg != 0) {
            return iZzg;
        }
        int i11 = 0;
        if (i10 == 1) {
            long j10 = this.zzb;
            long j11 = zzjoVar2.zzb;
            if (j10 < j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }
        if (i10 == 2) {
            boolean z10 = this.zzc;
            if (z10 == zzjoVar2.zzc) {
                return 0;
            }
            return z10 ? 1 : -1;
        }
        if (i10 == 3) {
            return Double.compare(this.zzd, zzjoVar2.zzd);
        }
        if (i10 == 4) {
            String str = this.zze;
            String str2 = zzjoVar2.zze;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i10 != 5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
            sb2.append("Invalid enum value: ");
            sb2.append(i10);
            throw new AssertionError(sb2.toString());
        }
        byte[] bArr = this.zzf;
        byte[] bArr2 = zzjoVar2.zzf;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        while (true) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (i11 >= Math.min(length2, length)) {
                return zzg(length2, length);
            }
            int i12 = bArr[i11] - bArr2[i11];
            if (i12 != 0) {
                return i12;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        int i10;
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (zzkl.zza(this.zza, zzjoVar.zza) && (i10 = this.zzg) == zzjoVar.zzg && this.zzh == zzjoVar.zzh && this.zzi == zzjoVar.zzi) {
                if (i10 == 1) {
                    return this.zzb == zzjoVar.zzb;
                }
                if (i10 == 2) {
                    return this.zzc == zzjoVar.zzc;
                }
                if (i10 == 3) {
                    return this.zzd == zzjoVar.zzd;
                }
                if (i10 == 4) {
                    return zzkl.zza(this.zze, zzjoVar.zze);
                }
                if (i10 == 5) {
                    return Arrays.equals(this.zzf, zzjoVar.zzf);
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                sb2.append("Invalid enum value: ");
                sb2.append(i10);
                throw new AssertionError(sb2.toString());
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        zzf(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        boolean zZzb = zzjp.zzb(str);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        if (!zZzb) {
            SafeParcelWriter.writeString(parcel, 2, str, false);
        }
        long j10 = this.zzb;
        if (j10 != 0) {
            SafeParcelWriter.writeLong(parcel, 3, j10);
        }
        if (this.zzc) {
            SafeParcelWriter.writeBoolean(parcel, 4, true);
        }
        double d10 = this.zzd;
        if (d10 != 0.0d) {
            SafeParcelWriter.writeDouble(parcel, 5, d10);
        }
        String str2 = this.zze;
        if (!zzjp.zzb(str2)) {
            SafeParcelWriter.writeString(parcel, 6, str2, false);
        }
        byte[] bArr = this.zzf;
        if (!zzjp.zzb(bArr)) {
            SafeParcelWriter.writeByteArray(parcel, 7, bArr, false);
        }
        int i11 = this.zzg;
        if (!zzjp.zza(i11)) {
            SafeParcelWriter.writeInt(parcel, 8, i11);
        }
        int i12 = this.zzh;
        if (!zzjp.zza(i12)) {
            SafeParcelWriter.writeInt(parcel, 9, i12);
        }
        int i13 = this.zzi;
        if (!zzjp.zza(i13)) {
            SafeParcelWriter.writeInt(parcel, 10, i13);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final long zza() {
        if (this.zzg == 1) {
            return this.zzb;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final boolean zzb() {
        if (this.zzg == 2) {
            return this.zzc;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final double zzc() {
        if (this.zzg == 3) {
            return this.zzd;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final String zzd() {
        if (this.zzg == 4) {
            return (String) Preconditions.checkNotNull(this.zze);
        }
        throw new IllegalArgumentException("Not a String type");
    }

    public final byte[] zze() {
        if (this.zzg == 5) {
            return (byte[]) Preconditions.checkNotNull(this.zzf);
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    final void zzf(StringBuilder sb2) {
        sb2.append("Flag(");
        String str = this.zza;
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.zzg;
        if (i10 == 1) {
            sb2.append(this.zzb);
        } else if (i10 == 2) {
            sb2.append(this.zzc);
        } else if (i10 == 3) {
            sb2.append(this.zzd);
        } else if (i10 == 4) {
            sb2.append("'");
            sb2.append((String) Preconditions.checkNotNull(this.zze));
            sb2.append("'");
        } else {
            if (i10 != 5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i10).length());
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i10);
                throw new AssertionError(sb3.toString());
            }
            sb2.append("'");
            sb2.append(Base64.encodeToString((byte[]) Preconditions.checkNotNull(this.zzf), 3));
            sb2.append("'");
        }
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(this.zzh);
        sb2.append(", ");
        sb2.append(this.zzi);
        sb2.append(")");
    }
}
