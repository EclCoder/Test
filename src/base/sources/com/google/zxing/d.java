package com.google.zxing;

import java.util.Map;
import ye.f;
import ye.h;
import ye.j;
import ye.k;
import ye.l;
import ye.o;
import ye.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22487a;

        static {
            int[] iArr = new int[com.google.zxing.a.values().length];
            f22487a = iArr;
            try {
                iArr[com.google.zxing.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22487a[com.google.zxing.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22487a[com.google.zxing.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22487a[com.google.zxing.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22487a[com.google.zxing.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22487a[com.google.zxing.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22487a[com.google.zxing.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22487a[com.google.zxing.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22487a[com.google.zxing.a.f22464i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22487a[com.google.zxing.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22487a[com.google.zxing.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22487a[com.google.zxing.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22487a[com.google.zxing.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.e
    public ue.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        e kVar;
        switch (a.f22487a[aVar.ordinal()]) {
            case 1:
                kVar = new k();
                break;
            case 2:
                kVar = new s();
                break;
            case 3:
                kVar = new j();
                break;
            case 4:
                kVar = new o();
                break;
            case 5:
                kVar = new bf.a();
                break;
            case 6:
                kVar = new f();
                break;
            case 7:
                kVar = new h();
                break;
            case 8:
                kVar = new ye.d();
                break;
            case 9:
                kVar = new l();
                break;
            case 10:
                kVar = new ze.a();
                break;
            case 11:
                kVar = new ye.b();
                break;
            case 12:
                kVar = new we.a();
                break;
            case 13:
                kVar = new se.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return kVar.a(str, aVar, i10, i11, map);
    }
}
