package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzanx implements zzanl {
    private static final byte[] zza = {0, 7, 8, 15};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzanq zzg;
    private final zzanp zzh;
    private final zzanw zzi;
    private Bitmap zzj;

    public zzanx(List list) {
        zzet zzetVar = new zzet((byte[]) list.get(0));
        int iZzt = zzetVar.zzt();
        int iZzt2 = zzetVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzanq(719, 575, 0, 719, 0, 575);
        this.zzh = new zzanp(0, zzd(), zze(), zzf());
        this.zzi = new zzanw(iZzt, iZzt2);
    }

    private static zzanp zzb(zzes zzesVar, int i10) {
        int[] iArr;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i11 = 8;
        int iZzj5 = zzesVar.zzj(8);
        zzesVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iZzj6 = zzesVar.zzj(i11);
            int iZzj7 = zzesVar.zzj(i11);
            if ((iZzj7 & 128) != 0) {
                iArr = iArrZzd;
            } else {
                iArr = (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            }
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzesVar.zzj(i11);
                iZzj4 = zzesVar.zzj(i11);
                iZzj = zzesVar.zzj(i11);
                iZzj2 = zzesVar.zzj(i11);
                i12 -= 6;
            } else {
                int iZzj8 = zzesVar.zzj(6) << 2;
                int iZzj9 = zzesVar.zzj(4) << 4;
                i12 -= 4;
                iZzj = zzesVar.zzj(4) << 4;
                iZzj2 = zzesVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d10 = iZzj3;
            String str = zzfl.zza;
            double d11 = iZzj4 - 128;
            double d12 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) (d10 + (1.402d * d11)), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d10 + (d12 * 1.772d)), 255)));
            iZzj5 = iZzj5;
            i11 = 8;
        }
        return new zzanp(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzanr zzc(zzes zzesVar) {
        byte[] bArr;
        int iZzj = zzesVar.zzj(16);
        zzesVar.zzh(4);
        int iZzj2 = zzesVar.zzj(2);
        boolean zZzi = zzesVar.zzi();
        zzesVar.zzh(1);
        byte[] bArr2 = zzfl.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzesVar.zzj(16);
                int iZzj4 = zzesVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzesVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzesVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzanr(iZzj, zZzi, bArr2, bArr);
        }
        zzesVar.zzh(zzesVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzanr(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                int i14 = Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i15 = 1 != i13 ? 0 : 127;
                int i16 = i12 != 0 ? 127 : 0;
                if (i11 == 0) {
                    i14 = 0;
                }
                iArr[i10] = zzg(255, i15, i16, i14);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = zzg(63, 1 != (i10 & 1) ? 0 : 255, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE;
                if (i11 == 0) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = zzg(Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, (1 != (i10 & 1) ? 0 : 85) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 43) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = zzg(255, (1 != (i10 & 1) ? 0 : 43) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    private static void zzh(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c10;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int i13;
        int iZzj4;
        int iZzj5;
        int i14;
        int i15;
        int iZzj6;
        int i16;
        Paint paint2 = paint;
        zzes zzesVar = new zzes(bArr, bArr.length);
        int i17 = i11;
        int i18 = i12;
        byte[] bArrZzi = null;
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        while (zzesVar.zzc() != 0) {
            int iZzj7 = zzesVar.zzj(8);
            if (iZzj7 != 240) {
                int i19 = 4;
                int i20 = 1;
                int i21 = 2;
                switch (iZzj7) {
                    case 16:
                        int i22 = 1;
                        if (i10 == 3) {
                            if (bArrZzi == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzi;
                            }
                        } else if (i10 != 2) {
                            bArr2 = null;
                        } else if (bArrZzi3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzi3;
                        }
                        int i23 = 0;
                        while (true) {
                            int iZzj8 = zzesVar.zzj(2);
                            if (iZzj8 != 0) {
                                iZzj2 = i22;
                                iZzj = iZzj8;
                            } else {
                                if (zzesVar.zzi()) {
                                    iZzj3 = zzesVar.zzj(3) + 3;
                                    iZzj = zzesVar.zzj(2);
                                } else {
                                    if (zzesVar.zzi()) {
                                        iZzj2 = i22;
                                        iZzj = 0;
                                    } else {
                                        int iZzj9 = zzesVar.zzj(2);
                                        if (iZzj9 == 0) {
                                            c10 = 4;
                                            i23 = i22;
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else if (iZzj9 == i22) {
                                            c10 = 4;
                                            i23 = i23;
                                            iZzj2 = 2;
                                            iZzj = 0;
                                        } else if (iZzj9 == 2) {
                                            c10 = 4;
                                            i23 = i23;
                                            iZzj2 = zzesVar.zzj(4) + 12;
                                            iZzj = zzesVar.zzj(2);
                                        } else if (iZzj9 != 3) {
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else {
                                            iZzj3 = zzesVar.zzj(8) + 29;
                                            iZzj = zzesVar.zzj(2);
                                        }
                                        if (iZzj2 == 0 && paint2 != null) {
                                            int i24 = i18 + 1;
                                            float f10 = i18;
                                            if (bArr2 != 0) {
                                                iZzj = bArr2[iZzj];
                                            }
                                            paint2.setColor(iArr[iZzj]);
                                            canvas.drawRect(i17, f10, i17 + iZzj2, i24, paint2);
                                        }
                                        i17 += iZzj2;
                                        if (i23 != 0) {
                                            zzesVar.zzm();
                                        } else {
                                            paint2 = paint;
                                            i23 = i23;
                                            i22 = 1;
                                        }
                                    }
                                    c10 = 4;
                                    if (iZzj2 == 0) {
                                    }
                                    i17 += iZzj2;
                                    if (i23 != 0) {
                                        zzesVar.zzm();
                                    } else {
                                        paint2 = paint;
                                        i23 = i23;
                                        i22 = 1;
                                    }
                                }
                                iZzj2 = iZzj3;
                            }
                            c10 = 4;
                            if (iZzj2 == 0) {
                            }
                            i17 += iZzj2;
                            if (i23 != 0) {
                                zzesVar.zzm();
                            } else {
                                paint2 = paint;
                                i23 = i23;
                                i22 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i10 == 3 ? bArrZzi2 == null ? zzc : bArrZzi2 : null;
                        boolean z10 = false;
                        while (true) {
                            int iZzj10 = zzesVar.zzj(i19);
                            if (iZzj10 != 0) {
                                i13 = 1;
                                z10 = z10;
                            } else if (zzesVar.zzi()) {
                                if (zzesVar.zzi()) {
                                    int iZzj11 = zzesVar.zzj(i21);
                                    if (iZzj11 == 0) {
                                        i13 = 1;
                                    } else if (iZzj11 == 1) {
                                        i13 = i21;
                                    } else if (iZzj11 == i21) {
                                        iZzj4 = zzesVar.zzj(i19) + 9;
                                        iZzj5 = zzesVar.zzj(i19);
                                    } else if (iZzj11 != 3) {
                                        z10 = z10;
                                        iZzj10 = 0;
                                        i13 = 0;
                                    } else {
                                        iZzj4 = zzesVar.zzj(8) + 25;
                                        iZzj5 = zzesVar.zzj(i19);
                                    }
                                    iZzj10 = 0;
                                } else {
                                    iZzj4 = zzesVar.zzj(i21) + i19;
                                    iZzj5 = zzesVar.zzj(i19);
                                }
                                i13 = iZzj4;
                                z10 = z10;
                                iZzj10 = iZzj5;
                            } else {
                                int iZzj12 = zzesVar.zzj(3);
                                if (iZzj12 != 0) {
                                    i13 = iZzj12 + 2;
                                    iZzj10 = 0;
                                } else {
                                    z10 = true;
                                    iZzj10 = 0;
                                    i13 = 0;
                                }
                            }
                            if (i13 == 0 || paint2 == null) {
                                i14 = i21;
                            } else {
                                int i25 = i18 + 1;
                                float f11 = i18;
                                if (bArr4 != 0) {
                                    iZzj10 = bArr4[iZzj10];
                                }
                                paint2.setColor(iArr[iZzj10]);
                                i14 = 2;
                                canvas.drawRect(i17, f11, i17 + i13, i25, paint2);
                            }
                            i17 += i13;
                            if (z10) {
                                zzesVar.zzm();
                                continue;
                            } else {
                                i21 = i14;
                                z10 = z10;
                                i19 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i26 = i17;
                        int i27 = 0;
                        while (true) {
                            int iZzj13 = zzesVar.zzj(8);
                            if (iZzj13 != 0) {
                                i15 = i27;
                                iZzj6 = i20;
                            } else if (zzesVar.zzi()) {
                                i15 = i27;
                                iZzj6 = zzesVar.zzj(7);
                                iZzj13 = zzesVar.zzj(8);
                            } else {
                                int iZzj14 = zzesVar.zzj(7);
                                if (iZzj14 != 0) {
                                    i15 = i27;
                                    iZzj6 = iZzj14;
                                    iZzj13 = 0;
                                } else {
                                    i15 = i20;
                                    iZzj13 = 0;
                                    iZzj6 = 0;
                                }
                            }
                            if (iZzj6 == 0 || paint2 == null) {
                                i16 = i20;
                            } else {
                                paint2.setColor(iArr[iZzj13]);
                                i16 = i20;
                                canvas.drawRect(i26, i18, i26 + iZzj6, i18 + 1, paint2);
                            }
                            i26 += iZzj6;
                            if (i15 != 0) {
                                i17 = i26;
                                continue;
                            } else {
                                i20 = i16;
                                i27 = i15;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzj7) {
                            case 32:
                                bArrZzi3 = zzi(4, 4, zzesVar);
                                break;
                            case 33:
                                bArrZzi = zzi(4, 8, zzesVar);
                                break;
                            case 34:
                                bArrZzi2 = zzi(16, 8, zzesVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i18 += 2;
                i17 = i11;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i10, int i11, zzes zzesVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzesVar.zzj(i11);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i10, int i11, zzank zzankVar, zzdt zzdtVar) {
        boolean z10;
        zzand zzandVar;
        Canvas canvas;
        char c10;
        char c11;
        char c12;
        int i12;
        Canvas canvas2;
        int i13;
        zzanu zzanuVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i14;
        int iZzj5;
        zzes zzesVar = new zzes(bArr, i10 + i11);
        zzesVar.zzf(i10);
        while (true) {
            z10 = true;
            if (zzesVar.zzc() >= 48 && zzesVar.zzj(8) == 15) {
                zzanw zzanwVar = this.zzi;
                int iZzj6 = zzesVar.zzj(8);
                int iZzj7 = zzesVar.zzj(16);
                int iZzj8 = zzesVar.zzj(16);
                int iZze = zzesVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzesVar.zzc()) {
                    zzeg.zzc("DvbParser", "Data field length exceeds limit");
                    zzesVar.zzh(zzesVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzanwVar.zza) {
                                zzans zzansVar = zzanwVar.zzi;
                                int iZzj9 = zzesVar.zzj(8);
                                int iZzj10 = zzesVar.zzj(4);
                                int iZzj11 = zzesVar.zzj(2);
                                zzesVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i15 = iZzj8 - 2; i15 > 0; i15 -= 6) {
                                    int iZzj12 = zzesVar.zzj(8);
                                    zzesVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzant(zzesVar.zzj(16), zzesVar.zzj(16)));
                                }
                                zzans zzansVar2 = new zzans(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzansVar2.zzb != 0) {
                                    zzanwVar.zzi = zzansVar2;
                                    zzanwVar.zzc.clear();
                                    zzanwVar.zzd.clear();
                                    zzanwVar.zze.clear();
                                } else if (zzansVar != null) {
                                    if (zzansVar.zza != zzansVar2.zza) {
                                        zzanwVar.zzi = zzansVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzans zzansVar3 = zzanwVar.zzi;
                            if (iZzj7 == zzanwVar.zza && zzansVar3 != null) {
                                int iZzj13 = zzesVar.zzj(8);
                                zzesVar.zzh(4);
                                boolean zZzi = zzesVar.zzi();
                                zzesVar.zzh(3);
                                int iZzj14 = zzesVar.zzj(16);
                                int iZzj15 = zzesVar.zzj(16);
                                int iZzj16 = zzesVar.zzj(3);
                                int iZzj17 = zzesVar.zzj(3);
                                zzesVar.zzh(2);
                                int iZzj18 = zzesVar.zzj(8);
                                int iZzj19 = zzesVar.zzj(8);
                                int iZzj20 = zzesVar.zzj(4);
                                int iZzj21 = zzesVar.zzj(2);
                                zzesVar.zzh(2);
                                int i16 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i16 > 0) {
                                    int iZzj22 = zzesVar.zzj(16);
                                    int iZzj23 = zzesVar.zzj(2);
                                    int iZzj24 = zzesVar.zzj(2);
                                    int iZzj25 = zzesVar.zzj(12);
                                    zzesVar.zzh(4);
                                    int iZzj26 = zzesVar.zzj(12);
                                    int i17 = i16 - 6;
                                    if (iZzj23 == 1) {
                                        i16 -= 8;
                                        iZzj = zzesVar.zzj(8);
                                        iZzj2 = zzesVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i16 -= 8;
                                        iZzj = zzesVar.zzj(8);
                                        iZzj2 = zzesVar.zzj(8);
                                    } else {
                                        i16 = i17;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzanv(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzanu zzanuVar2 = new zzanu(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzansVar3.zzb == 0 && (zzanuVar = (zzanu) zzanwVar.zzc.get(zzanuVar2.zza)) != null) {
                                    int i18 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzanuVar.zzj;
                                        if (i18 < sparseArray3.size()) {
                                            zzanuVar2.zzj.put(sparseArray3.keyAt(i18), (zzanv) sparseArray3.valueAt(i18));
                                            i18++;
                                        }
                                    }
                                }
                                zzanwVar.zzc.put(zzanuVar2.zza, zzanuVar2);
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzanwVar.zza) {
                                zzanp zzanpVarZzb = zzb(zzesVar, iZzj8);
                                zzanwVar.zzd.put(zzanpVarZzb.zza, zzanpVarZzb);
                            } else if (iZzj7 == zzanwVar.zzb) {
                                zzanp zzanpVarZzb2 = zzb(zzesVar, iZzj8);
                                zzanwVar.zzf.put(zzanpVarZzb2.zza, zzanpVarZzb2);
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzanwVar.zza) {
                                zzanr zzanrVarZzc = zzc(zzesVar);
                                zzanwVar.zze.put(zzanrVarZzc.zza, zzanrVarZzc);
                            } else if (iZzj7 == zzanwVar.zzb) {
                                zzanr zzanrVarZzc2 = zzc(zzesVar);
                                zzanwVar.zzg.put(zzanrVarZzc2.zza, zzanrVarZzc2);
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzanwVar.zza) {
                                zzesVar.zzh(4);
                                boolean zZzi2 = zzesVar.zzi();
                                zzesVar.zzh(3);
                                int iZzj27 = zzesVar.zzj(16);
                                int iZzj28 = zzesVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzesVar.zzj(16);
                                    iZzj3 = zzesVar.zzj(16);
                                    iZzj5 = zzesVar.zzj(16);
                                    iZzj4 = zzesVar.zzj(16);
                                    i14 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i14 = 0;
                                    iZzj5 = 0;
                                }
                                zzanwVar.zzh = new zzanq(iZzj27, iZzj28, i14, iZzj3, iZzj5, iZzj4);
                            }
                            break;
                    }
                    zzesVar.zzo(iZze - zzesVar.zze());
                }
            }
        }
        zzanw zzanwVar2 = this.zzi;
        zzans zzansVar4 = zzanwVar2.zzi;
        if (zzansVar4 == null) {
            zzandVar = new zzand(zzgwm.zzi(), C.TIME_UNSET, C.TIME_UNSET);
        } else {
            zzanq zzanqVar = zzanwVar2.zzh;
            if (zzanqVar == null) {
                zzanqVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzanqVar.zza + 1 != bitmap.getWidth() || zzanqVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzanqVar.zza + 1, zzanqVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzansVar4.zzc;
            int i19 = 0;
            while (i19 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzant zzantVar = (zzant) sparseArray4.valueAt(i19);
                zzanu zzanuVar3 = (zzanu) zzanwVar2.zzc.get(sparseArray4.keyAt(i19));
                int i20 = zzantVar.zza + zzanqVar.zzc;
                int i21 = zzantVar.zzb + zzanqVar.zze;
                int i22 = zzanuVar3.zzc;
                int i23 = i20 + i22;
                boolean z11 = z10;
                int iMin = Math.min(i23, zzanqVar.zzd);
                int i24 = zzanuVar3.zzd;
                int i25 = i21 + i24;
                canvas3.clipRect(i20, i21, iMin, Math.min(i25, zzanqVar.zzf));
                int i26 = zzanuVar3.zzf;
                zzanp zzanpVar = (zzanp) zzanwVar2.zzd.get(i26);
                if (zzanpVar == null && (zzanpVar = (zzanp) zzanwVar2.zzf.get(i26)) == null) {
                    zzanpVar = this.zzh;
                }
                SparseArray sparseArray5 = zzanuVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i27 = i19;
                int i28 = 0;
                while (i28 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i28);
                    int i29 = i28;
                    zzanv zzanvVar = (zzanv) sparseArray5.valueAt(i28);
                    SparseArray sparseArray7 = sparseArray5;
                    zzanr zzanrVar = (zzanr) zzanwVar2.zze.get(iKeyAt);
                    if (zzanrVar == null) {
                        zzanrVar = (zzanr) zzanwVar2.zzg.get(iKeyAt);
                    }
                    if (zzanrVar != null) {
                        Paint paint = zzanrVar.zzb ? null : this.zzd;
                        int i30 = zzanuVar3.zze;
                        int i31 = zzanvVar.zza + i20;
                        int i32 = i21 + zzanvVar.zzb;
                        canvas2 = canvas3;
                        int[] iArr = i30 == 3 ? zzanpVar.zzd : i30 == 2 ? zzanpVar.zzc : zzanpVar.zzb;
                        i13 = i23;
                        zzh(zzanrVar.zzc, iArr, i30, i31, i32, paint, canvas2);
                        zzh(zzanrVar.zzd, iArr, i30, i31, i32 + 1, paint, canvas2);
                    } else {
                        canvas2 = canvas3;
                        i13 = i23;
                    }
                    i20 = i20;
                    i23 = i13;
                    i28 = i29 + 1;
                    i22 = i22;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzanwVar2 = zzanwVar2;
                }
                zzanw zzanwVar3 = zzanwVar2;
                Canvas canvas4 = canvas3;
                int i33 = i20;
                int i34 = i22;
                int i35 = i23;
                float f10 = i21;
                float f11 = i33;
                if (zzanuVar3.zzb) {
                    int i36 = zzanuVar3.zze;
                    if (i36 == 3) {
                        i12 = zzanpVar.zzd[zzanuVar3.zzg];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i36 == 2 ? zzanpVar.zzc[zzanuVar3.zzh] : zzanpVar.zzb[zzanuVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i12);
                    float f12 = i35;
                    c11 = c12;
                    c10 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f11, f10, f12, i25, paint2);
                } else {
                    canvas = canvas4;
                    c10 = 3;
                    c11 = 2;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i33, i21, i34, i24));
                float f13 = zzanqVar.zza;
                zzcwVar.zzi(f11 / f13);
                zzcwVar.zzj(0);
                float f14 = zzanqVar.zzb;
                zzcwVar.zzf(f10 / f14, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i34 / f13);
                zzcwVar.zzn(i24 / f14);
                arrayList.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i19 = i27 + 1;
                z10 = z11;
                zzanwVar2 = zzanwVar3;
                sparseArray4 = sparseArray6;
            }
            zzandVar = new zzand(arrayList, C.TIME_UNSET, C.TIME_UNSET);
        }
        zzdtVar.zza(zzandVar);
    }
}
