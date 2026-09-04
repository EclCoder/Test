package androidx.datastore.preferences.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class q0 implements c1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f3667r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f3668s = l1.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f3669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f3670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n0 f3673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f3675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x0 f3676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f3677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f3678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f3679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f3680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s0 f3681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b0 f3682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i1 f3683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o f3684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i0 f3685q;

    private q0(int[] iArr, Object[] objArr, int i10, int i11, n0 n0Var, x0 x0Var, boolean z10, int[] iArr2, int i12, int i13, s0 s0Var, b0 b0Var, i1 i1Var, o oVar, i0 i0Var) {
        this.f3669a = iArr;
        this.f3670b = objArr;
        this.f3671c = i10;
        this.f3672d = i11;
        this.f3675g = n0Var instanceof v;
        this.f3676h = x0Var;
        this.f3674f = oVar != null && oVar.e(n0Var);
        this.f3677i = z10;
        this.f3678j = iArr2;
        this.f3679k = i12;
        this.f3680l = i13;
        this.f3681m = s0Var;
        this.f3682n = b0Var;
        this.f3683o = i1Var;
        this.f3684p = oVar;
        this.f3673e = n0Var;
        this.f3685q = i0Var;
    }

    private final void A(Object obj, int i10, Object obj2, n nVar, b1 b1Var) {
        long jK = K(d0(i10));
        Object objZ = l1.z(obj, jK);
        if (objZ == null) {
            objZ = this.f3685q.newMapField(obj2);
            l1.O(obj, jK, objZ);
        } else if (this.f3685q.isImmutable(objZ)) {
            Object objNewMapField = this.f3685q.newMapField(obj2);
            this.f3685q.mergeFrom(objNewMapField, objZ);
            l1.O(obj, jK, objNewMapField);
            objZ = objNewMapField;
        }
        b1Var.c(this.f3685q.forMutableMapData(objZ), this.f3685q.forMapMetadata(obj2), nVar);
    }

    private void B(Object obj, Object obj2, int i10) {
        if (p(obj2, i10)) {
            long jK = K(d0(i10));
            Unsafe unsafe = f3668s;
            Object object = unsafe.getObject(obj2, jK);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + J(i10) + " is present but null: " + obj2);
            }
            c1 c1VarL = l(i10);
            if (!p(obj, i10)) {
                if (u(object)) {
                    Object objNewInstance = c1VarL.newInstance();
                    c1VarL.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jK, objNewInstance);
                } else {
                    unsafe.putObject(obj, jK, object);
                }
                X(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jK);
            if (!u(object2)) {
                Object objNewInstance2 = c1VarL.newInstance();
                c1VarL.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jK, objNewInstance2);
                object2 = objNewInstance2;
            }
            c1VarL.mergeFrom(object2, object);
        }
    }

    private void C(Object obj, Object obj2, int i10) {
        int iJ = J(i10);
        if (w(obj2, iJ, i10)) {
            long jK = K(d0(i10));
            Unsafe unsafe = f3668s;
            Object object = unsafe.getObject(obj2, jK);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + J(i10) + " is present but null: " + obj2);
            }
            c1 c1VarL = l(i10);
            if (!w(obj, iJ, i10)) {
                if (u(object)) {
                    Object objNewInstance = c1VarL.newInstance();
                    c1VarL.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jK, objNewInstance);
                } else {
                    unsafe.putObject(obj, jK, object);
                }
                Y(obj, iJ, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jK);
            if (!u(object2)) {
                Object objNewInstance2 = c1VarL.newInstance();
                c1VarL.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jK, objNewInstance2);
                object2 = objNewInstance2;
            }
            c1VarL.mergeFrom(object2, object);
        }
    }

    private void D(Object obj, Object obj2, int i10) {
        int iD0 = d0(i10);
        long jK = K(iD0);
        int iJ = J(i10);
        switch (c0(iD0)) {
            case 0:
                if (p(obj2, i10)) {
                    l1.K(obj, jK, l1.u(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 1:
                if (p(obj2, i10)) {
                    l1.L(obj, jK, l1.v(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 2:
                if (p(obj2, i10)) {
                    l1.N(obj, jK, l1.x(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 3:
                if (p(obj2, i10)) {
                    l1.N(obj, jK, l1.x(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 4:
                if (p(obj2, i10)) {
                    l1.M(obj, jK, l1.w(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 5:
                if (p(obj2, i10)) {
                    l1.N(obj, jK, l1.x(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 6:
                if (p(obj2, i10)) {
                    l1.M(obj, jK, l1.w(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 7:
                if (p(obj2, i10)) {
                    l1.E(obj, jK, l1.p(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 8:
                if (p(obj2, i10)) {
                    l1.O(obj, jK, l1.z(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 9:
                B(obj, obj2, i10);
                break;
            case 10:
                if (p(obj2, i10)) {
                    l1.O(obj, jK, l1.z(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 11:
                if (p(obj2, i10)) {
                    l1.M(obj, jK, l1.w(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 12:
                if (p(obj2, i10)) {
                    l1.M(obj, jK, l1.w(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 13:
                if (p(obj2, i10)) {
                    l1.M(obj, jK, l1.w(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 14:
                if (p(obj2, i10)) {
                    l1.N(obj, jK, l1.x(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 15:
                if (p(obj2, i10)) {
                    l1.M(obj, jK, l1.w(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 16:
                if (p(obj2, i10)) {
                    l1.N(obj, jK, l1.x(obj2, jK));
                    X(obj, i10);
                }
                break;
            case 17:
                B(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case SDK_INIT_API_VALUE:
            case AD_START_EVENT_VALUE:
            case AD_CLICK_EVENT_VALUE:
            case 48:
            case 49:
                this.f3682n.b(obj, obj2, jK);
                break;
            case 50:
                e1.E(this.f3685q, obj, obj2, jK);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case AD_VISIBILITY_VALUE:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                if (w(obj2, iJ, i10)) {
                    l1.O(obj, jK, l1.z(obj2, jK));
                    Y(obj, iJ, i10);
                }
                break;
            case 60:
                C(obj, obj2, i10);
                break;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case DEPRECATED_API_USED_VALUE:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case BLACK_SCREEN_IS_DETECTED_VALUE:
            case NATIVE_PLAY_ASSET_TYPE_VALUE:
                if (w(obj2, iJ, i10)) {
                    l1.O(obj, jK, l1.z(obj2, jK));
                    Y(obj, iJ, i10);
                }
                break;
            case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                C(obj, obj2, i10);
                break;
        }
    }

    private Object E(Object obj, int i10) {
        c1 c1VarL = l(i10);
        long jK = K(d0(i10));
        if (!p(obj, i10)) {
            return c1VarL.newInstance();
        }
        Object object = f3668s.getObject(obj, jK);
        if (u(object)) {
            return object;
        }
        Object objNewInstance = c1VarL.newInstance();
        if (object != null) {
            c1VarL.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object F(Object obj, int i10, int i11) {
        c1 c1VarL = l(i11);
        if (!w(obj, i10, i11)) {
            return c1VarL.newInstance();
        }
        Object object = f3668s.getObject(obj, K(d0(i11)));
        if (u(object)) {
            return object;
        }
        Object objNewInstance = c1VarL.newInstance();
        if (object != null) {
            c1VarL.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static q0 G(Class cls, l0 l0Var, s0 s0Var, b0 b0Var, i1 i1Var, o oVar, i0 i0Var) {
        if (l0Var instanceof a1) {
            return I((a1) l0Var, s0Var, b0Var, i1Var, oVar, i0Var);
        }
        android.support.v4.media.session.b.a(l0Var);
        return H(null, s0Var, b0Var, i1Var, oVar, i0Var);
    }

    static q0 H(g1 g1Var, s0 s0Var, b0 b0Var, i1 i1Var, o oVar, i0 i0Var) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    static q0 I(a1 a1Var, s0 s0Var, b0 b0Var, i1 i1Var, o oVar, i0 i0Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        int iObjectFieldOffset3;
        int i31;
        Field fieldW;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldW2;
        int i35;
        Object obj2;
        Field fieldW3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String strB = a1Var.b();
        int length = strB.length();
        char c10 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strB.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt2 = strB.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strB.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = f3667r;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = strB.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    cCharAt8 = strB.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i24;
                }
                iCharAt3 = i45 | (cCharAt8 << i46);
                i44 = i24;
            }
            int i47 = i44 + 1;
            int iCharAt4 = strB.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = strB.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int iCharAt5 = strB.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = strB.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt6 = strB.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = strB.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            iCharAt = strB.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = strB.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            int iCharAt7 = strB.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = strB.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt7 = i60 | (cCharAt3 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strB.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = strB.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strB.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt = strB.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt3 * 2) + iCharAt4;
            int i68 = iCharAt7;
            i12 = iCharAt5;
            i13 = i68;
            i14 = iCharAt3;
            iArr = iArr2;
            i15 = iCharAt9;
            i41 = i65;
            i16 = iCharAt6;
        }
        Unsafe unsafe = f3668s;
        Object[] objArrA = a1Var.a();
        Class<?> cls = a1Var.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i69 = i15 + i13;
        int i70 = i69;
        int i71 = i15;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = strB.charAt(i41);
            if (iCharAt10 >= c10) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = strB.charAt(i76);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i25 = i38;
            } else {
                i25 = i74;
            }
            int i78 = i25 + 1;
            int iCharAt11 = strB.charAt(i25);
            if (iCharAt11 >= c10) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = strB.charAt(i80);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i26 = i37;
            } else {
                i26 = i78;
            }
            int i82 = iCharAt11 & 255;
            int i83 = length;
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i26 + 1;
                int iCharAt12 = strB.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        cCharAt10 = strB.charAt(i84);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i84 = i36;
                        c11 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i86);
                    i84 = i36;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i33 = i11 + 1;
                    objArr[((i73 / 3) * 2) + 1] = objArrA[i11];
                } else {
                    if (i87 == 12 && (a1Var.getSyntax().equals(x0.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i33 = i11 + 1;
                        objArr[((i73 / 3) * 2) + 1] = objArrA[i11];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objArrA[i34];
                    if (obj instanceof Field) {
                        fieldW2 = (Field) obj;
                    } else {
                        fieldW2 = W(cls, (String) obj);
                        objArrA[i34] = fieldW2;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldW2);
                    i35 = i34 + 1;
                    obj2 = objArrA[i35];
                    if (obj2 instanceof Field) {
                        fieldW3 = (Field) obj2;
                    } else {
                        fieldW3 = W(cls, (String) obj2);
                        objArrA[i35] = fieldW3;
                    }
                    strB = strB;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldW3);
                    i31 = iObjectFieldOffset4;
                    i30 = 0;
                    i27 = iCharAt10;
                    i41 = i88;
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objArrA[i34];
                if (obj instanceof Field) {
                    fieldW2 = (Field) obj;
                } else {
                    fieldW2 = W(cls, (String) obj);
                    objArrA[i34] = fieldW2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldW2);
                i35 = i34 + 1;
                obj2 = objArrA[i35];
                if (obj2 instanceof Field) {
                    fieldW3 = (Field) obj2;
                } else {
                    fieldW3 = W(cls, (String) obj2);
                    objArrA[i35] = fieldW3;
                }
                strB = strB;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldW3);
                i31 = iObjectFieldOffset5;
                i30 = 0;
                i27 = iCharAt10;
                i41 = i88;
            } else {
                int i89 = i11 + 1;
                Field fieldW4 = W(cls, (String) objArrA[i11]);
                if (i82 == 9 || i82 == 17) {
                    i27 = iCharAt10;
                    objArr[((i73 / 3) * 2) + 1] = fieldW4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i27 = iCharAt10;
                        i32 = i11 + 2;
                        objArr[((i73 / 3) * 2) + 1] = objArrA[i89];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i27 = iCharAt10;
                        if (a1Var.getSyntax() == x0.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i32 = i11 + 2;
                            objArr[((i73 / 3) * 2) + 1] = objArrA[i89];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            int i90 = i26 + 1;
                            int iCharAt13 = strB.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i91 = iCharAt13 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i29 = i90 + 1;
                                    cCharAt9 = strB.charAt(i90);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i91 |= (cCharAt9 & 8191) << i92;
                                    i92 += 13;
                                    i90 = i29;
                                }
                                iCharAt13 = i91 | (cCharAt9 << i92);
                            } else {
                                i29 = i90;
                            }
                            int i93 = (i14 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrA[i93];
                            if (obj3 instanceof Field) {
                                fieldW = (Field) obj3;
                            } else {
                                fieldW = W(cls, (String) obj3);
                                objArrA[i93] = fieldW;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldW);
                            i30 = iCharAt13 % 32;
                        }
                        int i94 = iObjectFieldOffset2;
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i94;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    } else {
                        if (i82 == 50) {
                            int i95 = i71 + 1;
                            iArr[i71] = i73;
                            int i96 = (i73 / 3) * 2;
                            int i97 = i11 + 2;
                            objArr[i96] = objArrA[i89];
                            if ((iCharAt11 & 2048) != 0) {
                                i28 = i11 + 3;
                                objArr[i96 + 1] = objArrA[i97];
                                i27 = iCharAt10;
                                i71 = i95;
                            } else {
                                i28 = i97;
                                i71 = i95;
                                i27 = iCharAt10;
                            }
                        } else {
                            i27 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        }
                        int i98 = iObjectFieldOffset2;
                        if (i82 >= 18) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i98;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    }
                    i28 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    }
                    int i99 = iObjectFieldOffset2;
                    if (i82 >= 18) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    iObjectFieldOffset3 = i99;
                    i31 = iObjectFieldOffset;
                    i11 = i28;
                    i41 = i29;
                }
                i28 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                }
                int i910 = iObjectFieldOffset2;
                if (i82 >= 18) {
                    iArr[i70] = iObjectFieldOffset;
                    i70++;
                }
                iObjectFieldOffset3 = i910;
                i31 = iObjectFieldOffset;
                i11 = i28;
                i41 = i29;
            }
            int i100 = i73 + 1;
            iArr4[i73] = i27;
            int i101 = i73 + 2;
            int i102 = iObjectFieldOffset3;
            iArr4[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | i31;
            i73 += 3;
            iArr4[i101] = (i30 << 20) | i102;
            length = i83;
            iArr3 = iArr4;
            strB = strB;
            c10 = 55296;
        }
        return new q0(iArr3, objArr, i12, i16, a1Var.getDefaultInstance(), a1Var.getSyntax(), false, iArr, i15, i69, s0Var, b0Var, i1Var, oVar, i0Var);
    }

    private int J(int i10) {
        return this.f3669a[i10];
    }

    private static long K(int i10) {
        return i10 & 1048575;
    }

    private static boolean L(Object obj, long j10) {
        return ((Boolean) l1.z(obj, j10)).booleanValue();
    }

    private static double M(Object obj, long j10) {
        return ((Double) l1.z(obj, j10)).doubleValue();
    }

    private static float N(Object obj, long j10) {
        return ((Float) l1.z(obj, j10)).floatValue();
    }

    private static int O(Object obj, long j10) {
        return ((Integer) l1.z(obj, j10)).intValue();
    }

    private static long P(Object obj, long j10) {
        return ((Long) l1.z(obj, j10)).longValue();
    }

    private int Q(int i10) {
        if (i10 < this.f3671c || i10 > this.f3672d) {
            return -1;
        }
        return Z(i10, 0);
    }

    private int R(int i10) {
        return this.f3669a[i10 + 2];
    }

    private void S(Object obj, long j10, b1 b1Var, c1 c1Var, n nVar) {
        b1Var.e(this.f3682n.c(obj, j10), c1Var, nVar);
    }

    private void T(Object obj, int i10, b1 b1Var, c1 c1Var, n nVar) {
        b1Var.b(this.f3682n.c(obj, K(i10)), c1Var, nVar);
    }

    private void U(Object obj, int i10, b1 b1Var) {
        if (o(i10)) {
            l1.O(obj, K(i10), b1Var.readStringRequireUtf8());
        } else if (this.f3675g) {
            l1.O(obj, K(i10), b1Var.readString());
        } else {
            l1.O(obj, K(i10), b1Var.readBytes());
        }
    }

    private void V(Object obj, int i10, b1 b1Var) {
        if (o(i10)) {
            b1Var.readStringListRequireUtf8(this.f3682n.c(obj, K(i10)));
        } else {
            b1Var.readStringList(this.f3682n.c(obj, K(i10)));
        }
    }

    private static Field W(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void X(Object obj, int i10) {
        int iR = R(i10);
        long j10 = 1048575 & iR;
        if (j10 == 1048575) {
            return;
        }
        l1.M(obj, j10, (1 << (iR >>> 20)) | l1.w(obj, j10));
    }

    private void Y(Object obj, int i10, int i11) {
        l1.M(obj, R(i11) & 1048575, i10);
    }

    private int Z(int i10, int i11) {
        int length = (this.f3669a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iJ = J(i13);
            if (i10 == iJ) {
                return i13;
            }
            if (i10 < iJ) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void a0(Object obj, int i10, Object obj2) {
        f3668s.putObject(obj, K(d0(i10)), obj2);
        X(obj, i10);
    }

    private void b0(Object obj, int i10, int i11, Object obj2) {
        f3668s.putObject(obj, K(d0(i11)), obj2);
        Y(obj, i10, i11);
    }

    private boolean c(Object obj, Object obj2, int i10) {
        return p(obj, i10) == p(obj2, i10);
    }

    private static int c0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static boolean d(Object obj, long j10) {
        return l1.p(obj, j10);
    }

    private int d0(int i10) {
        return this.f3669a[i10 + 1];
    }

    private static void e(Object obj) {
        if (u(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void e0(Object obj, o1 o1Var) {
        Map.Entry entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        q0 q0Var = this;
        if (q0Var.f3674f) {
            r rVarC = q0Var.f3684p.c(obj);
            if (rVarC.j()) {
                entry = null;
                it = null;
            } else {
                Iterator itN = rVarC.n();
                entry = (Map.Entry) itN.next();
                it = itN;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = q0Var.f3669a.length;
        Unsafe unsafe = f3668s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iD0 = q0Var.d0(i14);
            int iJ = q0Var.J(i14);
            int iC0 = c0(iD0);
            if (iC0 <= 17) {
                int i16 = q0Var.f3669a[i14 + 2];
                z10 = true;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i15 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = i13;
                i11 = i15;
                i12 = 1 << (i16 >>> 20);
            } else {
                z10 = true;
                i10 = i13;
                i11 = i15;
                i12 = 0;
            }
            while (entry != null && q0Var.f3684p.a(entry) <= iJ) {
                q0Var.f3684p.j(o1Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jK = K(iD0);
            switch (iC0) {
                case 0:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeDouble(iJ, f(obj, jK));
                    }
                    break;
                case 1:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeFloat(iJ, i(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 2:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeInt64(iJ, unsafe.getLong(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 3:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeUInt64(iJ, unsafe.getLong(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 4:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeInt32(iJ, unsafe.getInt(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 5:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeFixed64(iJ, unsafe.getLong(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 6:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeFixed32(iJ, unsafe.getInt(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 7:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeBool(iJ, d(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 8:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        q0Var.h0(iJ, unsafe.getObject(obj, jK), o1Var);
                    }
                    break;
                case 9:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.c(iJ, unsafe.getObject(obj, jK), q0Var.l(i14));
                    }
                    break;
                case 10:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.b(iJ, (g) unsafe.getObject(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 11:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeUInt32(iJ, unsafe.getInt(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 12:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeEnum(iJ, unsafe.getInt(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 13:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeSFixed32(iJ, unsafe.getInt(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 14:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeSFixed64(iJ, unsafe.getLong(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 15:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeSInt32(iJ, unsafe.getInt(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 16:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.writeSInt64(iJ, unsafe.getLong(obj, jK));
                    }
                    q0Var = this;
                    break;
                case 17:
                    if (q0Var.q(obj, i14, i10, i11, i12)) {
                        o1Var.e(iJ, unsafe.getObject(obj, jK), q0Var.l(i14));
                    }
                    break;
                case 18:
                    e1.N(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 19:
                    e1.R(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 20:
                    e1.U(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 21:
                    e1.c0(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 22:
                    e1.T(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 23:
                    e1.Q(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 24:
                    e1.P(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 25:
                    e1.L(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 26:
                    e1.a0(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var);
                    break;
                case 27:
                    e1.V(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, q0Var.l(i14));
                    break;
                case 28:
                    e1.M(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var);
                    break;
                case 29:
                    z11 = false;
                    e1.b0(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 30:
                    z11 = false;
                    e1.O(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 31:
                    z11 = false;
                    e1.W(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 32:
                    z11 = false;
                    e1.X(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 33:
                    z11 = false;
                    e1.Y(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 34:
                    z11 = false;
                    e1.Z(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, false);
                    break;
                case 35:
                    e1.N(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 36:
                    e1.R(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 37:
                    e1.U(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 38:
                    e1.c0(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 39:
                    e1.T(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 40:
                    e1.Q(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 41:
                    e1.P(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 42:
                    e1.L(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 43:
                    e1.b0(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 44:
                    e1.O(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case SDK_INIT_API_VALUE:
                    e1.W(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case AD_START_EVENT_VALUE:
                    e1.X(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    e1.Y(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 48:
                    e1.Z(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, z10);
                    break;
                case 49:
                    e1.S(q0Var.J(i14), (List) unsafe.getObject(obj, jK), o1Var, q0Var.l(i14));
                    break;
                case 50:
                    q0Var.g0(o1Var, iJ, unsafe.getObject(obj, jK), i14);
                    break;
                case 51:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeDouble(iJ, M(obj, jK));
                    }
                    break;
                case 52:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeFloat(iJ, N(obj, jK));
                    }
                    break;
                case 53:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeInt64(iJ, P(obj, jK));
                    }
                    break;
                case 54:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeUInt64(iJ, P(obj, jK));
                    }
                    break;
                case 55:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeInt32(iJ, O(obj, jK));
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeFixed64(iJ, P(obj, jK));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeFixed32(iJ, O(obj, jK));
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeBool(iJ, L(obj, jK));
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        q0Var.h0(iJ, unsafe.getObject(obj, jK), o1Var);
                    }
                    break;
                case 60:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.c(iJ, unsafe.getObject(obj, jK), q0Var.l(i14));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.b(iJ, (g) unsafe.getObject(obj, jK));
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeUInt32(iJ, O(obj, jK));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeEnum(iJ, O(obj, jK));
                    }
                    break;
                case 64:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeSFixed32(iJ, O(obj, jK));
                    }
                    break;
                case 65:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeSFixed64(iJ, P(obj, jK));
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeSInt32(iJ, O(obj, jK));
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.writeSInt64(iJ, P(obj, jK));
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (q0Var.w(obj, iJ, i14)) {
                        o1Var.e(iJ, unsafe.getObject(obj, jK), q0Var.l(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i15 = i11;
            i13 = i10;
            entry = entry;
        }
        while (entry != null) {
            q0Var.f3684p.j(o1Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        q0Var.i0(q0Var.f3683o, obj, o1Var);
    }

    private static double f(Object obj, long j10) {
        return l1.u(obj, j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void f0(Object obj, o1 o1Var) {
        Iterator itE;
        Map.Entry entry;
        i0(this.f3683o, obj, o1Var);
        if (this.f3674f) {
            r rVarC = this.f3684p.c(obj);
            if (rVarC.j()) {
                itE = null;
                entry = null;
            } else {
                itE = rVarC.e();
                entry = (Map.Entry) itE.next();
            }
        } else {
            itE = null;
            entry = null;
        }
        for (int length = this.f3669a.length - 3; length >= 0; length -= 3) {
            int iD0 = d0(length);
            int iJ = J(length);
            while (entry != null && this.f3684p.a(entry) > iJ) {
                this.f3684p.j(o1Var, entry);
                entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
            }
            switch (c0(iD0)) {
                case 0:
                    if (p(obj, length)) {
                        o1Var.writeDouble(iJ, f(obj, K(iD0)));
                    }
                    break;
                case 1:
                    if (p(obj, length)) {
                        o1Var.writeFloat(iJ, i(obj, K(iD0)));
                    }
                    break;
                case 2:
                    if (p(obj, length)) {
                        o1Var.writeInt64(iJ, y(obj, K(iD0)));
                    }
                    break;
                case 3:
                    if (p(obj, length)) {
                        o1Var.writeUInt64(iJ, y(obj, K(iD0)));
                    }
                    break;
                case 4:
                    if (p(obj, length)) {
                        o1Var.writeInt32(iJ, n(obj, K(iD0)));
                    }
                    break;
                case 5:
                    if (p(obj, length)) {
                        o1Var.writeFixed64(iJ, y(obj, K(iD0)));
                    }
                    break;
                case 6:
                    if (p(obj, length)) {
                        o1Var.writeFixed32(iJ, n(obj, K(iD0)));
                    }
                    break;
                case 7:
                    if (p(obj, length)) {
                        o1Var.writeBool(iJ, d(obj, K(iD0)));
                    }
                    break;
                case 8:
                    if (p(obj, length)) {
                        h0(iJ, l1.z(obj, K(iD0)), o1Var);
                    }
                    break;
                case 9:
                    if (p(obj, length)) {
                        o1Var.c(iJ, l1.z(obj, K(iD0)), l(length));
                    }
                    break;
                case 10:
                    if (p(obj, length)) {
                        o1Var.b(iJ, (g) l1.z(obj, K(iD0)));
                    }
                    break;
                case 11:
                    if (p(obj, length)) {
                        o1Var.writeUInt32(iJ, n(obj, K(iD0)));
                    }
                    break;
                case 12:
                    if (p(obj, length)) {
                        o1Var.writeEnum(iJ, n(obj, K(iD0)));
                    }
                    break;
                case 13:
                    if (p(obj, length)) {
                        o1Var.writeSFixed32(iJ, n(obj, K(iD0)));
                    }
                    break;
                case 14:
                    if (p(obj, length)) {
                        o1Var.writeSFixed64(iJ, y(obj, K(iD0)));
                    }
                    break;
                case 15:
                    if (p(obj, length)) {
                        o1Var.writeSInt32(iJ, n(obj, K(iD0)));
                    }
                    break;
                case 16:
                    if (p(obj, length)) {
                        o1Var.writeSInt64(iJ, y(obj, K(iD0)));
                    }
                    break;
                case 17:
                    if (p(obj, length)) {
                        o1Var.e(iJ, l1.z(obj, K(iD0)), l(length));
                    }
                    break;
                case 18:
                    e1.N(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 19:
                    e1.R(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 20:
                    e1.U(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 21:
                    e1.c0(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 22:
                    e1.T(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 23:
                    e1.Q(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 24:
                    e1.P(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 25:
                    e1.L(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 26:
                    e1.a0(J(length), (List) l1.z(obj, K(iD0)), o1Var);
                    break;
                case 27:
                    e1.V(J(length), (List) l1.z(obj, K(iD0)), o1Var, l(length));
                    break;
                case 28:
                    e1.M(J(length), (List) l1.z(obj, K(iD0)), o1Var);
                    break;
                case 29:
                    e1.b0(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 30:
                    e1.O(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 31:
                    e1.W(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 32:
                    e1.X(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 33:
                    e1.Y(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 34:
                    e1.Z(J(length), (List) l1.z(obj, K(iD0)), o1Var, false);
                    break;
                case 35:
                    e1.N(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 36:
                    e1.R(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 37:
                    e1.U(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 38:
                    e1.c0(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 39:
                    e1.T(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 40:
                    e1.Q(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 41:
                    e1.P(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 42:
                    e1.L(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 43:
                    e1.b0(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 44:
                    e1.O(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case SDK_INIT_API_VALUE:
                    e1.W(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case AD_START_EVENT_VALUE:
                    e1.X(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    e1.Y(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 48:
                    e1.Z(J(length), (List) l1.z(obj, K(iD0)), o1Var, true);
                    break;
                case 49:
                    e1.S(J(length), (List) l1.z(obj, K(iD0)), o1Var, l(length));
                    break;
                case 50:
                    g0(o1Var, iJ, l1.z(obj, K(iD0)), length);
                    break;
                case 51:
                    if (w(obj, iJ, length)) {
                        o1Var.writeDouble(iJ, M(obj, K(iD0)));
                    }
                    break;
                case 52:
                    if (w(obj, iJ, length)) {
                        o1Var.writeFloat(iJ, N(obj, K(iD0)));
                    }
                    break;
                case 53:
                    if (w(obj, iJ, length)) {
                        o1Var.writeInt64(iJ, P(obj, K(iD0)));
                    }
                    break;
                case 54:
                    if (w(obj, iJ, length)) {
                        o1Var.writeUInt64(iJ, P(obj, K(iD0)));
                    }
                    break;
                case 55:
                    if (w(obj, iJ, length)) {
                        o1Var.writeInt32(iJ, O(obj, K(iD0)));
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.writeFixed64(iJ, P(obj, K(iD0)));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.writeFixed32(iJ, O(obj, K(iD0)));
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.writeBool(iJ, L(obj, K(iD0)));
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (w(obj, iJ, length)) {
                        h0(iJ, l1.z(obj, K(iD0)), o1Var);
                    }
                    break;
                case 60:
                    if (w(obj, iJ, length)) {
                        o1Var.c(iJ, l1.z(obj, K(iD0)), l(length));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.b(iJ, (g) l1.z(obj, K(iD0)));
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.writeUInt32(iJ, O(obj, K(iD0)));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.writeEnum(iJ, O(obj, K(iD0)));
                    }
                    break;
                case 64:
                    if (w(obj, iJ, length)) {
                        o1Var.writeSFixed32(iJ, O(obj, K(iD0)));
                    }
                    break;
                case 65:
                    if (w(obj, iJ, length)) {
                        o1Var.writeSFixed64(iJ, P(obj, K(iD0)));
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.writeSInt32(iJ, O(obj, K(iD0)));
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.writeSInt64(iJ, P(obj, K(iD0)));
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (w(obj, iJ, length)) {
                        o1Var.e(iJ, l1.z(obj, K(iD0)), l(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f3684p.j(o1Var, entry);
            entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
        }
    }

    private boolean g(Object obj, Object obj2, int i10) {
        int iD0 = d0(i10);
        long jK = K(iD0);
        switch (c0(iD0)) {
            case 0:
                return c(obj, obj2, i10) && Double.doubleToLongBits(l1.u(obj, jK)) == Double.doubleToLongBits(l1.u(obj2, jK));
            case 1:
                return c(obj, obj2, i10) && Float.floatToIntBits(l1.v(obj, jK)) == Float.floatToIntBits(l1.v(obj2, jK));
            case 2:
                return c(obj, obj2, i10) && l1.x(obj, jK) == l1.x(obj2, jK);
            case 3:
                return c(obj, obj2, i10) && l1.x(obj, jK) == l1.x(obj2, jK);
            case 4:
                return c(obj, obj2, i10) && l1.w(obj, jK) == l1.w(obj2, jK);
            case 5:
                return c(obj, obj2, i10) && l1.x(obj, jK) == l1.x(obj2, jK);
            case 6:
                return c(obj, obj2, i10) && l1.w(obj, jK) == l1.w(obj2, jK);
            case 7:
                return c(obj, obj2, i10) && l1.p(obj, jK) == l1.p(obj2, jK);
            case 8:
                return c(obj, obj2, i10) && e1.H(l1.z(obj, jK), l1.z(obj2, jK));
            case 9:
                return c(obj, obj2, i10) && e1.H(l1.z(obj, jK), l1.z(obj2, jK));
            case 10:
                return c(obj, obj2, i10) && e1.H(l1.z(obj, jK), l1.z(obj2, jK));
            case 11:
                return c(obj, obj2, i10) && l1.w(obj, jK) == l1.w(obj2, jK);
            case 12:
                return c(obj, obj2, i10) && l1.w(obj, jK) == l1.w(obj2, jK);
            case 13:
                return c(obj, obj2, i10) && l1.w(obj, jK) == l1.w(obj2, jK);
            case 14:
                return c(obj, obj2, i10) && l1.x(obj, jK) == l1.x(obj2, jK);
            case 15:
                return c(obj, obj2, i10) && l1.w(obj, jK) == l1.w(obj2, jK);
            case 16:
                return c(obj, obj2, i10) && l1.x(obj, jK) == l1.x(obj2, jK);
            case 17:
                return c(obj, obj2, i10) && e1.H(l1.z(obj, jK), l1.z(obj2, jK));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case SDK_INIT_API_VALUE:
            case AD_START_EVENT_VALUE:
            case AD_CLICK_EVENT_VALUE:
            case 48:
            case 49:
                return e1.H(l1.z(obj, jK), l1.z(obj2, jK));
            case 50:
                return e1.H(l1.z(obj, jK), l1.z(obj2, jK));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case AD_VISIBILITY_VALUE:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
            case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case DEPRECATED_API_USED_VALUE:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case BLACK_SCREEN_IS_DETECTED_VALUE:
            case NATIVE_PLAY_ASSET_TYPE_VALUE:
            case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                return v(obj, obj2, i10) && e1.H(l1.z(obj, jK), l1.z(obj2, jK));
            default:
                return true;
        }
    }

    private void g0(o1 o1Var, int i10, Object obj, int i11) {
        if (obj != null) {
            o1Var.d(i10, this.f3685q.forMapMetadata(k(i11)), this.f3685q.forMapData(obj));
        }
    }

    private Object h(Object obj, int i10, Object obj2, i1 i1Var, Object obj3) {
        J(i10);
        if (l1.z(obj, K(d0(i10))) == null) {
            return obj2;
        }
        j(i10);
        return obj2;
    }

    private void h0(int i10, Object obj, o1 o1Var) {
        if (obj instanceof String) {
            o1Var.writeString(i10, (String) obj);
        } else {
            o1Var.b(i10, (g) obj);
        }
    }

    private static float i(Object obj, long j10) {
        return l1.v(obj, j10);
    }

    private void i0(i1 i1Var, Object obj, o1 o1Var) {
        i1Var.t(i1Var.g(obj), o1Var);
    }

    private x.a j(int i10) {
        android.support.v4.media.session.b.a(this.f3670b[((i10 / 3) * 2) + 1]);
        return null;
    }

    private Object k(int i10) {
        return this.f3670b[(i10 / 3) * 2];
    }

    private c1 l(int i10) {
        int i11 = (i10 / 3) * 2;
        c1 c1Var = (c1) this.f3670b[i11];
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1VarC = y0.a().c((Class) this.f3670b[i11 + 1]);
        this.f3670b[i11] = c1VarC;
        return c1VarC;
    }

    private int m(i1 i1Var, Object obj) {
        return i1Var.h(i1Var.g(obj));
    }

    private static int n(Object obj, long j10) {
        return l1.w(obj, j10);
    }

    private static boolean o(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean p(Object obj, int i10) {
        boolean zEquals;
        int iR = R(i10);
        long j10 = 1048575 & iR;
        if (j10 != 1048575) {
            return (l1.w(obj, j10) & (1 << (iR >>> 20))) != 0;
        }
        int iD0 = d0(i10);
        long jK = K(iD0);
        switch (c0(iD0)) {
            case 0:
                return Double.doubleToRawLongBits(l1.u(obj, jK)) != 0;
            case 1:
                return Float.floatToRawIntBits(l1.v(obj, jK)) != 0;
            case 2:
                return l1.x(obj, jK) != 0;
            case 3:
                return l1.x(obj, jK) != 0;
            case 4:
                return l1.w(obj, jK) != 0;
            case 5:
                return l1.x(obj, jK) != 0;
            case 6:
                return l1.w(obj, jK) != 0;
            case 7:
                return l1.p(obj, jK);
            case 8:
                Object objZ = l1.z(obj, jK);
                if (objZ instanceof String) {
                    zEquals = ((String) objZ).isEmpty();
                } else {
                    if (!(objZ instanceof g)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = g.f3535b.equals(objZ);
                }
                break;
            case 9:
                return l1.z(obj, jK) != null;
            case 10:
                zEquals = g.f3535b.equals(l1.z(obj, jK));
                break;
            case 11:
                return l1.w(obj, jK) != 0;
            case 12:
                return l1.w(obj, jK) != 0;
            case 13:
                return l1.w(obj, jK) != 0;
            case 14:
                return l1.x(obj, jK) != 0;
            case 15:
                return l1.w(obj, jK) != 0;
            case 16:
                return l1.x(obj, jK) != 0;
            case 17:
                return l1.z(obj, jK) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean q(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return p(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean r(Object obj, int i10, c1 c1Var) {
        return c1Var.isInitialized(l1.z(obj, K(i10)));
    }

    private boolean s(Object obj, int i10, int i11) {
        List list = (List) l1.z(obj, K(i10));
        if (list.isEmpty()) {
            return true;
        }
        c1 c1VarL = l(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!c1VarL.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean t(Object obj, int i10, int i11) {
        Map mapForMapData = this.f3685q.forMapData(l1.z(obj, K(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.f3685q.forMapMetadata(k(i11)).f3550c.d() != n1.c.MESSAGE) {
            return true;
        }
        c1 c1VarC = null;
        for (Object obj2 : mapForMapData.values()) {
            if (c1VarC == null) {
                c1VarC = y0.a().c(obj2.getClass());
            }
            if (!c1VarC.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v) {
            return ((v) obj).y();
        }
        return true;
    }

    private boolean v(Object obj, Object obj2, int i10) {
        long jR = R(i10) & 1048575;
        return l1.w(obj, jR) == l1.w(obj2, jR);
    }

    private boolean w(Object obj, int i10, int i11) {
        return l1.w(obj, (long) (R(i11) & 1048575)) == i10;
    }

    private static boolean x(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static long y(Object obj, long j10) {
        return l1.x(obj, j10);
    }

    /* JADX WARN: Code duplicated, block: B:229:0x06d2 A[Catch: all -> 0x06f3, TRY_LEAVE, TryCatch #9 {all -> 0x06f3, blocks: (B:227:0x06cc, B:229:0x06d2, B:240:0x06f7, B:241:0x06fc), top: B:274:0x06cc }] */
    /* JADX WARN: Code duplicated, block: B:234:0x06df A[LOOP:2: B:232:0x06db->B:234:0x06df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x06f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x06f7 A[Catch: all -> 0x06f3, TRY_ENTER, TryCatch #9 {all -> 0x06f3, blocks: (B:227:0x06cc, B:229:0x06d2, B:240:0x06f7, B:241:0x06fc), top: B:274:0x06cc }] */
    /* JADX WARN: Code duplicated, block: B:246:0x070a A[LOOP:3: B:244:0x0706->B:246:0x070a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x072d A[LOOP:4: B:254:0x0729->B:256:0x072d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x0740  */
    /* JADX WARN: Code duplicated, block: B:316:0x06d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0703 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:? A[RETURN, SYNTHETIC] */
    private void z(i1 i1Var, o oVar, Object obj, b1 b1Var, n nVar) throws Throwable {
        Object obj2;
        int i10;
        Object objH;
        i1 i1Var2;
        q0 q0Var;
        Object obj3;
        Object objF;
        i1 i1Var3;
        o oVar2;
        Object objB;
        i1 i1Var4;
        int i11;
        Object objH2;
        int i12;
        b1 b1Var2;
        q0 q0Var2;
        Object obj4;
        Object obj5;
        q0 q0Var3 = this;
        n nVar2 = nVar;
        r rVarD = null;
        Object objG = null;
        while (true) {
            try {
                int fieldNumber = b1Var.getFieldNumber();
                int iQ = q0Var3.Q(fieldNumber);
                if (iQ >= 0) {
                    obj3 = obj;
                    nVar = nVar2;
                    objF = objG;
                    i1Var3 = i1Var;
                    b1 b1Var3 = b1Var;
                    try {
                        int iD0 = q0Var3.d0(iQ);
                        try {
                            switch (c0(iD0)) {
                                case 0:
                                    l1.K(obj3, K(iD0), b1Var3.readDouble());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 1:
                                    l1.L(obj3, K(iD0), b1Var3.readFloat());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 2:
                                    l1.N(obj3, K(iD0), b1Var3.readInt64());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 3:
                                    l1.N(obj3, K(iD0), b1Var3.readUInt64());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 4:
                                    l1.M(obj3, K(iD0), b1Var3.readInt32());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 5:
                                    l1.N(obj3, K(iD0), b1Var3.readFixed64());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 6:
                                    l1.M(obj3, K(iD0), b1Var3.readFixed32());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 7:
                                    l1.E(obj3, K(iD0), b1Var3.readBool());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 8:
                                    q0Var3.U(obj3, iD0, b1Var3);
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 9:
                                    n0 n0Var = (n0) q0Var3.E(obj3, iQ);
                                    b1Var3.a(n0Var, q0Var3.l(iQ), nVar);
                                    q0Var3.a0(obj3, iQ, n0Var);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 10:
                                    l1.O(obj3, K(iD0), b1Var3.readBytes());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 11:
                                    l1.M(obj3, K(iD0), b1Var3.readUInt32());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 12:
                                    int i13 = b1Var3.readEnum();
                                    q0Var3.j(iQ);
                                    l1.M(obj3, K(iD0), i13);
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 13:
                                    l1.M(obj3, K(iD0), b1Var3.readSFixed32());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 14:
                                    l1.N(obj3, K(iD0), b1Var3.readSFixed64());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 15:
                                    l1.M(obj3, K(iD0), b1Var3.readSInt32());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 16:
                                    l1.N(obj3, K(iD0), b1Var3.readSInt64());
                                    q0Var3.X(obj3, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 17:
                                    n0 n0Var2 = (n0) q0Var3.E(obj3, iQ);
                                    b1Var3.d(n0Var2, q0Var3.l(iQ), nVar);
                                    q0Var3.a0(obj3, iQ, n0Var2);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 18:
                                    b1Var3.readDoubleList(q0Var3.f3682n.c(obj3, K(iD0)));
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 19:
                                    b1Var3.readFloatList(q0Var3.f3682n.c(obj3, K(iD0)));
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 20:
                                    b1Var3.readInt64List(q0Var3.f3682n.c(obj3, K(iD0)));
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 21:
                                    b1Var3.readUInt64List(q0Var3.f3682n.c(obj3, K(iD0)));
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 22:
                                    b1Var3.readInt32List(q0Var3.f3682n.c(obj3, K(iD0)));
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 23:
                                    b1Var3.readFixed64List(q0Var3.f3682n.c(obj3, K(iD0)));
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 24:
                                    b1Var3.readFixed32List(q0Var3.f3682n.c(obj3, K(iD0)));
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 25:
                                    b1Var3.readBoolList(q0Var3.f3682n.c(obj3, K(iD0)));
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 26:
                                    q0Var3.V(obj3, iD0, b1Var3);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 27:
                                    i1Var = i1Var3;
                                    obj2 = obj3;
                                    q0 q0Var4 = q0Var3;
                                    try {
                                        nVar = nVar;
                                        try {
                                            q0Var3.T(obj2, iD0, b1Var3, q0Var4.l(iQ), nVar);
                                            objG = objF;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                            objG = objF;
                                            try {
                                                if (i1Var.q(b1Var3)) {
                                                    if (objG == null) {
                                                        objG = i1Var.f(obj2);
                                                    }
                                                    if (!i1Var.m(objG, b1Var3, 0)) {
                                                        objH2 = objG;
                                                        for (i11 = q0Var3.f3679k; i11 < q0Var3.f3680l; i11++) {
                                                            objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                        }
                                                        if (objH2 == null) {
                                                            return;
                                                        }
                                                        i1Var.o(obj2, objH2);
                                                        return;
                                                    }
                                                } else if (!b1Var3.skipField()) {
                                                    objH2 = objG;
                                                    for (i12 = q0Var3.f3679k; i12 < q0Var3.f3680l; i12++) {
                                                        objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                                    }
                                                    if (objH2 == null) {
                                                        return;
                                                    }
                                                    i1Var.o(obj2, objH2);
                                                    return;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        nVar = nVar;
                                        q0Var3 = q0Var4;
                                        b1Var3 = b1Var3;
                                    }
                                    nVar2 = nVar;
                                    break;
                                case 28:
                                    b1Var2 = b1Var3;
                                    q0Var2 = q0Var3;
                                    b1Var2.readBytesList(q0Var2.f3682n.c(obj3, K(iD0)));
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 29:
                                    b1Var2 = b1Var3;
                                    i1Var = i1Var3;
                                    obj2 = obj3;
                                    q0Var2 = q0Var3;
                                    try {
                                        try {
                                            b1Var2.readUInt32List(q0Var2.f3682n.c(obj2, K(iD0)));
                                            q0Var3 = q0Var2;
                                            objG = objF;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            q0Var3 = q0Var2;
                                            objG = objF;
                                            i10 = q0Var3.f3679k;
                                            objH = objG;
                                            while (i10 < q0Var3.f3680l) {
                                                objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                                i10++;
                                                q0Var3 = this;
                                            }
                                            i1Var2 = i1Var;
                                            if (objH != null) {
                                                i1Var2.o(obj2, objH);
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        q0Var3 = q0Var2;
                                        objG = objF;
                                        b1Var3 = b1Var2;
                                        if (i1Var.q(b1Var3)) {
                                            if (objG == null) {
                                                objG = i1Var.f(obj2);
                                            }
                                            if (!i1Var.m(objG, b1Var3, 0)) {
                                                objH2 = objG;
                                                while (i11 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        } else if (!b1Var3.skipField()) {
                                            objH2 = objG;
                                            while (i12 < q0Var3.f3680l) {
                                                objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                            }
                                            if (objH2 == null) {
                                                return;
                                            }
                                            i1Var.o(obj2, objH2);
                                            return;
                                        }
                                    }
                                    nVar2 = nVar;
                                    break;
                                case 30:
                                    q0Var2 = q0Var3;
                                    obj2 = obj3;
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    try {
                                        List listC = q0Var2.f3682n.c(obj2, K(iD0));
                                        b1Var2.readEnumList(listC);
                                        q0Var2.j(iQ);
                                        obj4 = obj2;
                                        try {
                                            objG = e1.z(obj4, fieldNumber, listC, null, objG, i1Var);
                                            nVar = nVar;
                                            q0Var3 = q0Var2;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            i1Var = i1Var;
                                            obj2 = obj4;
                                            q0Var3 = q0Var2;
                                            b1Var3 = b1Var2;
                                            if (i1Var.q(b1Var3)) {
                                                if (objG == null) {
                                                    objG = i1Var.f(obj2);
                                                }
                                                if (!i1Var.m(objG, b1Var3, 0)) {
                                                    objH2 = objG;
                                                    while (i11 < q0Var3.f3680l) {
                                                        objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                    }
                                                    if (objH2 == null) {
                                                        return;
                                                    }
                                                    i1Var.o(obj2, objH2);
                                                    return;
                                                }
                                            } else if (!b1Var3.skipField()) {
                                                objH2 = objG;
                                                while (i12 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = obj4;
                                            i1Var = i1Var;
                                            q0Var3 = q0Var2;
                                            i10 = q0Var3.f3679k;
                                            objH = objG;
                                            while (i10 < q0Var3.f3680l) {
                                                objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                                i10++;
                                                q0Var3 = this;
                                            }
                                            i1Var2 = i1Var;
                                            if (objH != null) {
                                                i1Var2.o(obj2, objH);
                                            }
                                            throw th;
                                        }
                                        break;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        q0Var3 = q0Var2;
                                        b1Var3 = b1Var2;
                                        if (i1Var.q(b1Var3)) {
                                            if (objG == null) {
                                                objG = i1Var.f(obj2);
                                            }
                                            if (!i1Var.m(objG, b1Var3, 0)) {
                                                objH2 = objG;
                                                while (i11 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        } else if (!b1Var3.skipField()) {
                                            objH2 = objG;
                                            while (i12 < q0Var3.f3680l) {
                                                objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                            }
                                            if (objH2 == null) {
                                                return;
                                            }
                                            i1Var.o(obj2, objH2);
                                            return;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        i1Var = i1Var;
                                    }
                                    nVar2 = nVar;
                                    break;
                                case 31:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readSFixed32List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 32:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readSFixed64List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 33:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readSInt32List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 34:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readSInt64List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 35:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readDoubleList(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 36:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readFloatList(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 37:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readInt64List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 38:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readUInt64List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 39:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readInt32List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 40:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readFixed64List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 41:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readFixed32List(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 42:
                                    b1Var2 = b1Var3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    b1Var2.readBoolList(q0Var2.f3682n.c(obj3, K(iD0)));
                                    objF = objG;
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 43:
                                    b1Var2 = b1Var3;
                                    obj2 = obj3;
                                    objG = objF;
                                    q0Var2 = q0Var3;
                                    try {
                                        b1Var2.readUInt32List(q0Var2.f3682n.c(obj2, K(iD0)));
                                        objF = objG;
                                        q0Var3 = q0Var2;
                                        objG = objF;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                        q0Var3 = q0Var2;
                                        b1Var3 = b1Var2;
                                        if (i1Var.q(b1Var3)) {
                                            if (objG == null) {
                                                objG = i1Var.f(obj2);
                                            }
                                            if (!i1Var.m(objG, b1Var3, 0)) {
                                                objH2 = objG;
                                                while (i11 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        } else if (!b1Var3.skipField()) {
                                            objH2 = objG;
                                            while (i12 < q0Var3.f3680l) {
                                                objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                            }
                                            if (objH2 == null) {
                                                return;
                                            }
                                            i1Var.o(obj2, objH2);
                                            return;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        i1Var = i1Var;
                                        q0Var3 = q0Var2;
                                        i10 = q0Var3.f3679k;
                                        objH = objG;
                                        while (i10 < q0Var3.f3680l) {
                                            objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                            i10++;
                                            q0Var3 = this;
                                        }
                                        i1Var2 = i1Var;
                                        if (objH != null) {
                                            i1Var2.o(obj2, objH);
                                        }
                                        throw th;
                                    }
                                    nVar2 = nVar;
                                    break;
                                case 44:
                                    q0Var2 = q0Var3;
                                    obj4 = obj3;
                                    b1Var2 = b1Var3;
                                    try {
                                        List listC2 = q0Var2.f3682n.c(obj4, K(iD0));
                                        b1Var2.readEnumList(listC2);
                                        q0Var2.j(iQ);
                                        objG = objF;
                                        try {
                                            objG = e1.z(obj4, fieldNumber, listC2, null, objG, i1Var3);
                                            nVar = nVar;
                                            q0Var3 = q0Var2;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                            i1Var = i1Var;
                                            obj2 = obj4;
                                            q0Var3 = q0Var2;
                                            b1Var3 = b1Var2;
                                            if (i1Var.q(b1Var3)) {
                                                if (objG == null) {
                                                    objG = i1Var.f(obj2);
                                                }
                                                if (!i1Var.m(objG, b1Var3, 0)) {
                                                    objH2 = objG;
                                                    while (i11 < q0Var3.f3680l) {
                                                        objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                    }
                                                    if (objH2 == null) {
                                                        return;
                                                    }
                                                    i1Var.o(obj2, objH2);
                                                    return;
                                                }
                                            } else if (!b1Var3.skipField()) {
                                                objH2 = objG;
                                                while (i12 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj2 = obj4;
                                            i1Var = i1Var;
                                            q0Var3 = q0Var2;
                                            i10 = q0Var3.f3679k;
                                            objH = objG;
                                            while (i10 < q0Var3.f3680l) {
                                                objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                                i10++;
                                                q0Var3 = this;
                                            }
                                            i1Var2 = i1Var;
                                            if (objH != null) {
                                                i1Var2.o(obj2, objH);
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        objG = objF;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        obj2 = obj4;
                                        objG = objF;
                                    }
                                    nVar2 = nVar;
                                    break;
                                case SDK_INIT_API_VALUE:
                                    q0Var2 = q0Var3;
                                    obj5 = obj3;
                                    b1Var2 = b1Var3;
                                    b1Var2.readSFixed32List(q0Var2.f3682n.c(obj5, K(iD0)));
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case AD_START_EVENT_VALUE:
                                    q0Var2 = q0Var3;
                                    obj5 = obj3;
                                    b1Var2 = b1Var3;
                                    b1Var2.readSFixed64List(q0Var2.f3682n.c(obj5, K(iD0)));
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case AD_CLICK_EVENT_VALUE:
                                    q0Var2 = q0Var3;
                                    obj5 = obj3;
                                    b1Var2 = b1Var3;
                                    b1Var2.readSInt32List(q0Var2.f3682n.c(obj5, K(iD0)));
                                    q0Var3 = q0Var2;
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 48:
                                    q0Var2 = q0Var3;
                                    obj5 = obj3;
                                    b1Var2 = b1Var3;
                                    i1Var = i1Var3;
                                    try {
                                        b1Var2.readSInt64List(q0Var2.f3682n.c(obj5, K(iD0)));
                                        q0Var3 = q0Var2;
                                        objG = objF;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                        obj2 = obj5;
                                        q0Var3 = q0Var2;
                                        objG = objF;
                                        b1Var3 = b1Var2;
                                        if (i1Var.q(b1Var3)) {
                                            if (objG == null) {
                                                objG = i1Var.f(obj2);
                                            }
                                            if (!i1Var.m(objG, b1Var3, 0)) {
                                                objH2 = objG;
                                                while (i11 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        } else if (!b1Var3.skipField()) {
                                            objH2 = objG;
                                            while (i12 < q0Var3.f3680l) {
                                                objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                            }
                                            if (objH2 == null) {
                                                return;
                                            }
                                            i1Var.o(obj2, objH2);
                                            return;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        obj2 = obj5;
                                        q0Var3 = q0Var2;
                                        objG = objF;
                                        i10 = q0Var3.f3679k;
                                        objH = objG;
                                        while (i10 < q0Var3.f3680l) {
                                            objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                            i10++;
                                            q0Var3 = this;
                                        }
                                        i1Var2 = i1Var;
                                        if (objH != null) {
                                            i1Var2.o(obj2, objH);
                                        }
                                        throw th;
                                    }
                                    nVar2 = nVar;
                                    break;
                                case 49:
                                    i1Var = i1Var3;
                                    try {
                                        obj2 = obj;
                                        try {
                                            q0Var3.S(obj2, K(iD0), b1Var, q0Var3.l(iQ), nVar);
                                            q0Var2 = q0Var3;
                                            obj5 = obj2;
                                            b1Var2 = b1Var;
                                            q0Var3 = q0Var2;
                                            objG = objF;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                            nVar = nVar;
                                            b1Var3 = b1Var;
                                            objG = objF;
                                            if (i1Var.q(b1Var3)) {
                                                if (objG == null) {
                                                    objG = i1Var.f(obj2);
                                                }
                                                if (!i1Var.m(objG, b1Var3, 0)) {
                                                    objH2 = objG;
                                                    while (i11 < q0Var3.f3680l) {
                                                        objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                    }
                                                    if (objH2 == null) {
                                                        return;
                                                    }
                                                    i1Var.o(obj2, objH2);
                                                    return;
                                                }
                                            } else if (!b1Var3.skipField()) {
                                                objH2 = objG;
                                                while (i12 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            q0Var2 = q0Var3;
                                            q0Var3 = q0Var2;
                                            objG = objF;
                                            i10 = q0Var3.f3679k;
                                            objH = objG;
                                            while (i10 < q0Var3.f3680l) {
                                                objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                                i10++;
                                                q0Var3 = this;
                                            }
                                            i1Var2 = i1Var;
                                            if (objH != null) {
                                                i1Var2.o(obj2, objH);
                                            }
                                            throw th;
                                        }
                                        nVar2 = nVar;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        q0Var2 = q0Var3;
                                        obj5 = obj;
                                        obj2 = obj5;
                                        q0Var3 = q0Var2;
                                        objG = objF;
                                        i10 = q0Var3.f3679k;
                                        objH = objG;
                                        while (i10 < q0Var3.f3680l) {
                                            objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                            i10++;
                                            q0Var3 = this;
                                        }
                                        i1Var2 = i1Var;
                                        if (objH != null) {
                                            i1Var2.o(obj2, objH);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 50:
                                    i1Var = i1Var3;
                                    try {
                                        try {
                                            q0Var3.A(obj3, iQ, q0Var3.k(iQ), nVar, b1Var);
                                            nVar = nVar;
                                            objG = objF;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                                            obj2 = obj;
                                            b1Var3 = b1Var;
                                            nVar = nVar;
                                            objG = objF;
                                            if (i1Var.q(b1Var3)) {
                                                if (objG == null) {
                                                    objG = i1Var.f(obj2);
                                                }
                                                if (!i1Var.m(objG, b1Var3, 0)) {
                                                    objH2 = objG;
                                                    while (i11 < q0Var3.f3680l) {
                                                        objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                    }
                                                    if (objH2 == null) {
                                                        return;
                                                    }
                                                    i1Var.o(obj2, objH2);
                                                    return;
                                                }
                                            } else if (!b1Var3.skipField()) {
                                                objH2 = objG;
                                                while (i12 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        }
                                        nVar2 = nVar;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = obj;
                                    }
                                    break;
                                case 51:
                                    l1.O(obj3, K(iD0), Double.valueOf(b1Var3.readDouble()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 52:
                                    l1.O(obj3, K(iD0), Float.valueOf(b1Var3.readFloat()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 53:
                                    l1.O(obj3, K(iD0), Long.valueOf(b1Var3.readInt64()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 54:
                                    l1.O(obj3, K(iD0), Long.valueOf(b1Var3.readUInt64()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 55:
                                    l1.O(obj3, K(iD0), Integer.valueOf(b1Var3.readInt32()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case AD_VISIBILITY_VALUE:
                                    l1.O(obj3, K(iD0), Long.valueOf(b1Var3.readFixed64()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                    l1.O(obj3, K(iD0), Integer.valueOf(b1Var3.readFixed32()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                                    l1.O(obj3, K(iD0), Boolean.valueOf(b1Var3.readBool()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                                    q0Var3.U(obj3, iD0, b1Var3);
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 60:
                                    n0 n0Var3 = (n0) q0Var3.F(obj3, fieldNumber, iQ);
                                    b1Var3.a(n0Var3, q0Var3.l(iQ), nVar);
                                    q0Var3.b0(obj3, fieldNumber, iQ, n0Var3);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                    l1.O(obj3, K(iD0), b1Var3.readBytes());
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case DEPRECATED_API_USED_VALUE:
                                    l1.O(obj3, K(iD0), Integer.valueOf(b1Var3.readUInt32()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                    int i14 = b1Var3.readEnum();
                                    q0Var3.j(iQ);
                                    l1.O(obj3, K(iD0), Integer.valueOf(i14));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 64:
                                    l1.O(obj3, K(iD0), Integer.valueOf(b1Var3.readSFixed32()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case 65:
                                    l1.O(obj3, K(iD0), Long.valueOf(b1Var3.readSFixed64()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case BLACK_SCREEN_IS_DETECTED_VALUE:
                                    l1.O(obj3, K(iD0), Integer.valueOf(b1Var3.readSInt32()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                                    l1.O(obj3, K(iD0), Long.valueOf(b1Var3.readSInt64()));
                                    q0Var3.Y(obj3, fieldNumber, iQ);
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                                    i1Var = i1Var3;
                                    try {
                                        n0 n0Var4 = (n0) q0Var3.F(obj3, fieldNumber, iQ);
                                        b1Var3.d(n0Var4, q0Var3.l(iQ), nVar);
                                        q0Var3.b0(obj3, fieldNumber, iQ, n0Var4);
                                        objG = objF;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused12) {
                                        obj2 = obj3;
                                        objG = objF;
                                        if (i1Var.q(b1Var3)) {
                                            if (objG == null) {
                                                objG = i1Var.f(obj2);
                                            }
                                            if (!i1Var.m(objG, b1Var3, 0)) {
                                                objH2 = objG;
                                                while (i11 < q0Var3.f3680l) {
                                                    objH2 = q0Var3.h(obj2, q0Var3.f3678j[i11], objH2, i1Var, obj);
                                                }
                                                if (objH2 == null) {
                                                    return;
                                                }
                                                i1Var.o(obj2, objH2);
                                                return;
                                            }
                                        } else if (!b1Var3.skipField()) {
                                            objH2 = objG;
                                            while (i12 < q0Var3.f3680l) {
                                                objH2 = q0Var3.h(obj2, q0Var3.f3678j[i12], objH2, i1Var, obj);
                                            }
                                            if (objH2 == null) {
                                                return;
                                            }
                                            i1Var.o(obj2, objH2);
                                            return;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        obj2 = obj3;
                                        objG = objF;
                                        i10 = q0Var3.f3679k;
                                        objH = objG;
                                        while (i10 < q0Var3.f3680l) {
                                            objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                            i10++;
                                            q0Var3 = this;
                                        }
                                        i1Var2 = i1Var;
                                        if (objH != null) {
                                            i1Var2.o(obj2, objH);
                                        }
                                        throw th;
                                    }
                                    nVar2 = nVar;
                                    break;
                                default:
                                    if (objF == null) {
                                        objF = i1Var3.f(obj3);
                                    }
                                    if (!i1Var3.m(objF, b1Var3, 0)) {
                                        Object objH3 = objF;
                                        for (int i15 = q0Var3.f3679k; i15 < q0Var3.f3680l; i15++) {
                                            objH3 = q0Var3.h(obj3, q0Var3.f3678j[i15], objH3, i1Var3, obj);
                                        }
                                        if (objH3 != null) {
                                            i1Var3.o(obj3, objH3);
                                            return;
                                        }
                                        return;
                                    }
                                    objG = objF;
                                    nVar2 = nVar;
                                    break;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused13) {
                            i1Var = i1Var3;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        i1Var = i1Var3;
                        obj2 = obj3;
                        objG = objF;
                        i10 = q0Var3.f3679k;
                        objH = objG;
                        while (i10 < q0Var3.f3680l) {
                            objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                            i10++;
                            q0Var3 = this;
                        }
                        i1Var2 = i1Var;
                        if (objH != null) {
                            i1Var2.o(obj2, objH);
                        }
                        throw th;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        int i16 = q0Var3.f3679k;
                        Object objH4 = objG;
                        while (i16 < q0Var3.f3680l) {
                            objH4 = q0Var3.h(obj, q0Var3.f3678j[i16], objH4, i1Var, obj);
                            i16++;
                            q0Var3 = q0Var3;
                        }
                        if (objH4 != null) {
                            i1Var.o(obj, objH4);
                        }
                        return;
                    }
                    q0Var = q0Var3;
                    try {
                        if (q0Var.f3674f) {
                            oVar2 = oVar;
                            objB = oVar2.b(nVar2, q0Var.f3673e, fieldNumber);
                        } else {
                            oVar2 = oVar;
                            objB = null;
                        }
                        if (objB != null) {
                            if (rVarD == null) {
                                try {
                                    rVarD = oVar.d(obj);
                                } catch (Throwable th16) {
                                    th = th16;
                                    obj2 = obj;
                                    i1Var = i1Var;
                                    q0Var3 = q0Var;
                                }
                            }
                            Object obj6 = objG;
                            r rVar = rVarD;
                            try {
                                rVarD = rVar;
                                objG = oVar2.g(obj, b1Var, objB, nVar2, rVar, obj6, i1Var);
                                nVar2 = nVar2;
                                q0Var3 = q0Var;
                            } catch (Throwable th17) {
                                th = th17;
                                obj2 = obj;
                                objF = obj6;
                                i1Var4 = i1Var;
                                i1Var = i1Var4;
                                q0Var3 = q0Var;
                                objG = objF;
                                i10 = q0Var3.f3679k;
                                objH = objG;
                                while (i10 < q0Var3.f3680l) {
                                    objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                    i10++;
                                    q0Var3 = this;
                                }
                                i1Var2 = i1Var;
                                if (objH != null) {
                                    i1Var2.o(obj2, objH);
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            objF = objG;
                            i1Var4 = i1Var;
                            n nVar3 = nVar2;
                            try {
                                if (i1Var4.q(b1Var)) {
                                    try {
                                        if (!b1Var.skipField()) {
                                        }
                                        nVar2 = nVar3;
                                        q0Var3 = q0Var;
                                        objG = objF;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        i1Var = i1Var4;
                                        q0Var3 = q0Var;
                                        objG = objF;
                                        i10 = q0Var3.f3679k;
                                        objH = objG;
                                        while (i10 < q0Var3.f3680l) {
                                            objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                                            i10++;
                                            q0Var3 = this;
                                        }
                                        i1Var2 = i1Var;
                                        if (objH != null) {
                                            i1Var2.o(obj2, objH);
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (objF == null) {
                                        objF = i1Var4.f(obj2);
                                    }
                                    if (!i1Var4.m(objF, b1Var, 0)) {
                                    }
                                    nVar2 = nVar3;
                                    q0Var3 = q0Var;
                                    objG = objF;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                q0Var3 = q0Var;
                                i1Var = i1Var4;
                            }
                        }
                    } catch (Throwable th20) {
                        th = th20;
                        obj3 = obj;
                        objF = objG;
                        i1Var3 = i1Var;
                        q0Var3 = q0Var;
                        i1Var = i1Var3;
                        obj2 = obj3;
                    }
                }
                objG = objF;
            } catch (Throwable th21) {
                th = th21;
                i1Var = i1Var;
                obj2 = obj;
            }
            i10 = q0Var3.f3679k;
            objH = objG;
            while (i10 < q0Var3.f3680l) {
                objH = q0Var3.h(obj2, q0Var3.f3678j[i10], objH, i1Var, obj);
                i10++;
                q0Var3 = this;
            }
            i1Var2 = i1Var;
            if (objH != null) {
                i1Var2.o(obj2, objH);
            }
            throw th;
        }
        Object objH5 = objF;
        for (int i17 = q0Var.f3679k; i17 < q0Var.f3680l; i17++) {
            objH5 = q0Var.h(obj2, q0Var.f3678j[i17], objH5, i1Var4, obj);
        }
        if (objH5 != null) {
            i1Var4.o(obj2, objH5);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public void a(Object obj, b1 b1Var, n nVar) throws Throwable {
        nVar.getClass();
        e(obj);
        z(this.f3683o, this.f3684p, obj, b1Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public void b(Object obj, o1 o1Var) {
        if (o1Var.fieldOrder() == o1.a.DESCENDING) {
            f0(obj, o1Var);
        } else {
            e0(obj, o1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public boolean equals(Object obj, Object obj2) {
        int length = this.f3669a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!g(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f3683o.g(obj).equals(this.f3683o.g(obj2))) {
            return false;
        }
        if (this.f3674f) {
            return this.f3684p.c(obj).equals(this.f3684p.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 androidx.datastore.preferences.protobuf.q0) = 
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v24 androidx.datastore.preferences.protobuf.q0)
      (r0v30 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
      (r0v1 androidx.datastore.preferences.protobuf.q0)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v4 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v5 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.c1
    public int getSerializedSize(Object obj) {
        int i10;
        int iH;
        int iP;
        int iW;
        int i11;
        int iO;
        int iQ;
        q0 q0Var = this;
        Object obj2 = obj;
        Unsafe unsafe = f3668s;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < q0Var.f3669a.length) {
            int iD0 = q0Var.d0(i13);
            int iC0 = c0(iD0);
            int iJ = q0Var.J(i13);
            int i17 = q0Var.f3669a[i13 + 2];
            int i18 = i17 & i12;
            if (iC0 <= 17) {
                if (i18 != i16) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i16 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = i15;
            long jK = K(iD0);
            if (iC0 < s.O.d() || iC0 > s.f3697b0.d()) {
                i18 = 0;
            }
            switch (iC0) {
                case 0:
                    if (!q0Var.q(obj2, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.h(iJ, 0.0d);
                        i15 = i19 + iH;
                    }
                    break;
                case 1:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iP = CodedOutputStream.p(iJ, 0.0f);
                        i15 = i19 + iP;
                        q0Var = this;
                        obj2 = obj;
                    }
                    q0Var = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 2:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iW = CodedOutputStream.w(iJ, unsafe.getLong(obj2, jK));
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 3:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iW = CodedOutputStream.R(iJ, unsafe.getLong(obj2, jK));
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 4:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iW = CodedOutputStream.u(iJ, unsafe.getInt(obj2, jK));
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 5:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iP = CodedOutputStream.n(iJ, 0L);
                        i15 = i19 + iP;
                        q0Var = this;
                        obj2 = obj;
                    }
                    q0Var = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 6:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iP = CodedOutputStream.l(iJ, 0);
                        i15 = i19 + iP;
                        q0Var = this;
                        obj2 = obj;
                    }
                    q0Var = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 7:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iP = CodedOutputStream.c(iJ, true);
                        i15 = i19 + iP;
                        q0Var = this;
                        obj2 = obj;
                    }
                    q0Var = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 8:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        Object object = unsafe.getObject(obj2, jK);
                        iW = object instanceof g ? CodedOutputStream.f(iJ, (g) object) : CodedOutputStream.M(iJ, (String) object);
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 9:
                    if (!q0Var.q(obj2, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iH = e1.o(iJ, unsafe.getObject(obj2, jK), q0Var.l(i13));
                        i15 = i19 + iH;
                    }
                    break;
                case 10:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iW = CodedOutputStream.f(iJ, (g) unsafe.getObject(obj2, jK));
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 11:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iW = CodedOutputStream.P(iJ, unsafe.getInt(obj2, jK));
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 12:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iW = CodedOutputStream.j(iJ, unsafe.getInt(obj2, jK));
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 13:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iP = CodedOutputStream.E(iJ, 0);
                        i15 = i19 + iP;
                        q0Var = this;
                        obj2 = obj;
                    }
                    q0Var = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 14:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iP = CodedOutputStream.G(iJ, 0L);
                        i15 = i19 + iP;
                        q0Var = this;
                        obj2 = obj;
                    }
                    q0Var = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 15:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iW = CodedOutputStream.I(iJ, unsafe.getInt(obj2, jK));
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 16:
                    if (q0Var.q(obj2, i13, i16, i14, i10)) {
                        iW = CodedOutputStream.K(iJ, unsafe.getLong(obj2, jK));
                        i15 = i19 + iW;
                        q0Var = this;
                    }
                    q0Var = this;
                    i15 = i19;
                    break;
                case 17:
                    if (!q0Var.q(obj2, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.r(iJ, (n0) unsafe.getObject(obj2, jK), q0Var.l(i13));
                        i15 = i19 + iH;
                    }
                    break;
                case 18:
                    iH = e1.h(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 19:
                    iH = e1.f(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 20:
                    iH = e1.m(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 21:
                    iH = e1.x(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 22:
                    iH = e1.k(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 23:
                    iH = e1.h(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 24:
                    iH = e1.f(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 25:
                    iH = e1.a(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 26:
                    iH = e1.u(iJ, (List) unsafe.getObject(obj2, jK));
                    i15 = i19 + iH;
                    break;
                case 27:
                    iH = e1.p(iJ, (List) unsafe.getObject(obj2, jK), q0Var.l(i13));
                    i15 = i19 + iH;
                    break;
                case 28:
                    iH = e1.c(iJ, (List) unsafe.getObject(obj2, jK));
                    i15 = i19 + iH;
                    break;
                case 29:
                    iH = e1.v(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 30:
                    iH = e1.d(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 31:
                    iH = e1.f(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 32:
                    iH = e1.h(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 33:
                    iH = e1.q(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 34:
                    iH = e1.s(iJ, (List) unsafe.getObject(obj2, jK), false);
                    i15 = i19 + iH;
                    break;
                case 35:
                    i11 = e1.i((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 36:
                    i11 = e1.g((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 37:
                    i11 = e1.n((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 38:
                    i11 = e1.y((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 39:
                    i11 = e1.l((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 40:
                    i11 = e1.i((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 41:
                    i11 = e1.g((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 42:
                    i11 = e1.b((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 43:
                    i11 = e1.w((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 44:
                    i11 = e1.e((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case SDK_INIT_API_VALUE:
                    i11 = e1.g((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case AD_START_EVENT_VALUE:
                    i11 = e1.i((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case AD_CLICK_EVENT_VALUE:
                    i11 = e1.r((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 48:
                    i11 = e1.t((List) unsafe.getObject(obj2, jK));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (q0Var.f3677i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = CodedOutputStream.O(iJ);
                        iQ = CodedOutputStream.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 49:
                    iH = e1.j(iJ, (List) unsafe.getObject(obj2, jK), q0Var.l(i13));
                    i15 = i19 + iH;
                    break;
                case 50:
                    iH = q0Var.f3685q.getSerializedSize(iJ, unsafe.getObject(obj2, jK), q0Var.k(i13));
                    i15 = i19 + iH;
                    break;
                case 51:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.h(iJ, 0.0d);
                        i15 = i19 + iH;
                    }
                    break;
                case 52:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.p(iJ, 0.0f);
                        i15 = i19 + iH;
                    }
                    break;
                case 53:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.w(iJ, P(obj2, jK));
                        i15 = i19 + iH;
                    }
                    break;
                case 54:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.R(iJ, P(obj2, jK));
                        i15 = i19 + iH;
                    }
                    break;
                case 55:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.u(iJ, O(obj2, jK));
                        i15 = i19 + iH;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.n(iJ, 0L);
                        i15 = i19 + iH;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.l(iJ, 0);
                        i15 = i19 + iH;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.c(iJ, true);
                        i15 = i19 + iH;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        Object object2 = unsafe.getObject(obj2, jK);
                        iH = object2 instanceof g ? CodedOutputStream.f(iJ, (g) object2) : CodedOutputStream.M(iJ, (String) object2);
                        i15 = i19 + iH;
                    }
                    break;
                case 60:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = e1.o(iJ, unsafe.getObject(obj2, jK), q0Var.l(i13));
                        i15 = i19 + iH;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.f(iJ, (g) unsafe.getObject(obj2, jK));
                        i15 = i19 + iH;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.P(iJ, O(obj2, jK));
                        i15 = i19 + iH;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.j(iJ, O(obj2, jK));
                        i15 = i19 + iH;
                    }
                    break;
                case 64:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.E(iJ, 0);
                        i15 = i19 + iH;
                    }
                    break;
                case 65:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.G(iJ, 0L);
                        i15 = i19 + iH;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.I(iJ, O(obj2, jK));
                        i15 = i19 + iH;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.K(iJ, P(obj2, jK));
                        i15 = i19 + iH;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (!q0Var.w(obj2, iJ, i13)) {
                        i15 = i19;
                    } else {
                        iH = CodedOutputStream.r(iJ, (n0) unsafe.getObject(obj2, jK), q0Var.l(i13));
                        i15 = i19 + iH;
                    }
                    break;
                default:
                    i15 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int iM = i15 + q0Var.m(q0Var.f3683o, obj2);
        return q0Var.f3674f ? iM + q0Var.f3684p.c(obj2).h() : iM;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public int hashCode(Object obj) {
        int i10;
        int iF;
        int length = this.f3669a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iD0 = d0(i12);
            int iJ = J(i12);
            long jK = K(iD0);
            int iHashCode = 37;
            switch (c0(iD0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = x.f(Double.doubleToLongBits(l1.u(obj, jK)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(l1.v(obj, jK));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = x.f(l1.x(obj, jK));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = x.f(l1.x(obj, jK));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = l1.w(obj, jK);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = x.f(l1.x(obj, jK));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = l1.w(obj, jK);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = x.c(l1.p(obj, jK));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) l1.z(obj, jK)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objZ = l1.z(obj, jK);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = l1.z(obj, jK).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = l1.w(obj, jK);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = l1.w(obj, jK);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = l1.w(obj, jK);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = x.f(l1.x(obj, jK));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = l1.w(obj, jK);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = x.f(l1.x(obj, jK));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objZ2 = l1.z(obj, jK);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case SDK_INIT_API_VALUE:
                case AD_START_EVENT_VALUE:
                case AD_CLICK_EVENT_VALUE:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iF = l1.z(obj, jK).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = l1.z(obj, jK).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = x.f(Double.doubleToLongBits(M(obj, jK)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(N(obj, jK));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = x.f(P(obj, jK));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = x.f(P(obj, jK));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = O(obj, jK);
                        i11 = i10 + iF;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = x.f(P(obj, jK));
                        i11 = i10 + iF;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = O(obj, jK);
                        i11 = i10 + iF;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = x.c(L(obj, jK));
                        i11 = i10 + iF;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) l1.z(obj, jK)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 60:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = l1.z(obj, jK).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = l1.z(obj, jK).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = O(obj, jK);
                        i11 = i10 + iF;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = O(obj, jK);
                        i11 = i10 + iF;
                    }
                    break;
                case 64:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = O(obj, jK);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = x.f(P(obj, jK));
                        i11 = i10 + iF;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = O(obj, jK);
                        i11 = i10 + iF;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = x.f(P(obj, jK));
                        i11 = i10 + iF;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (w(obj, iJ, i12)) {
                        i10 = i11 * 53;
                        iF = l1.z(obj, jK).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f3683o.g(obj).hashCode();
        return this.f3674f ? (iHashCode2 * 53) + this.f3684p.c(obj).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.c1
    public final boolean isInitialized(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f3679k) {
            int i15 = this.f3678j[i13];
            int iJ = J(i15);
            int iD0 = d0(i15);
            int i16 = this.f3669a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f3668s.getInt(obj, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            Object obj2 = obj;
            if (x(iD0) && !q(obj2, i15, i10, i11, i18)) {
                return false;
            }
            int iC0 = c0(iD0);
            if (iC0 == 9 || iC0 == 17) {
                if (q(obj2, i15, i10, i11, i18) && !r(obj2, iD0, l(i15))) {
                    return false;
                }
            } else if (iC0 == 27) {
                if (!s(obj2, iD0, i15)) {
                    return false;
                }
            } else if (iC0 == 60 || iC0 == 68) {
                if (w(obj2, iJ, i15) && !r(obj2, iD0, l(i15))) {
                    return false;
                }
            } else if (iC0 != 49) {
                if (iC0 == 50 && !t(obj2, iD0, i15)) {
                    return false;
                }
            } else if (!s(obj2, iD0, i15)) {
                return false;
            }
            i13++;
            obj = obj2;
            i12 = i10;
            i14 = i11;
        }
        return !this.f3674f || this.f3684p.c(obj).k();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.c1
    public void makeImmutable(Object obj) {
        if (u(obj)) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                vVar.i();
                vVar.h();
                vVar.A();
            }
            int length = this.f3669a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iD0 = d0(i10);
                long jK = K(iD0);
                int iC0 = c0(iD0);
                if (iC0 != 9) {
                    if (iC0 != 60 && iC0 != 68) {
                        switch (iC0) {
                            case 17:
                                if (p(obj, i10)) {
                                    l(i10).makeImmutable(f3668s.getObject(obj, jK));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case SDK_INIT_API_VALUE:
                            case AD_START_EVENT_VALUE:
                            case AD_CLICK_EVENT_VALUE:
                            case 48:
                            case 49:
                                this.f3682n.a(obj, jK);
                                break;
                            case 50:
                                Unsafe unsafe = f3668s;
                                Object object = unsafe.getObject(obj, jK);
                                if (object != null) {
                                    unsafe.putObject(obj, jK, this.f3685q.toImmutable(object));
                                }
                                break;
                        }
                    } else if (w(obj, J(i10), i10)) {
                        l(i10).makeImmutable(f3668s.getObject(obj, jK));
                    }
                } else if (p(obj, i10)) {
                    l(i10).makeImmutable(f3668s.getObject(obj, jK));
                }
            }
            this.f3683o.j(obj);
            if (this.f3674f) {
                this.f3684p.f(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public void mergeFrom(Object obj, Object obj2) {
        e(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f3669a.length; i10 += 3) {
            D(obj, obj2, i10);
        }
        e1.F(this.f3683o, obj, obj2);
        if (this.f3674f) {
            e1.D(this.f3684p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public Object newInstance() {
        return this.f3681m.newInstance(this.f3673e);
    }
}
