package com.fasterxml.jackson.core;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum g {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f16208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final char[] f16209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f16210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f16211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f16212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f16213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f16214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f16215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f16216i;

    g(String str, int i10) {
        boolean z10 = false;
        if (str == null) {
            this.f16208a = null;
            this.f16209b = null;
            this.f16210c = null;
        } else {
            this.f16208a = str;
            char[] charArray = str.toCharArray();
            this.f16209b = charArray;
            int length = charArray.length;
            this.f16210c = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.f16210c[i11] = (byte) this.f16209b[i11];
            }
        }
        this.f16211d = i10;
        this.f16215h = i10 == 10 || i10 == 9;
        this.f16214g = i10 == 7 || i10 == 8;
        boolean z11 = i10 == 1 || i10 == 3;
        this.f16212e = z11;
        boolean z12 = i10 == 2 || i10 == 4;
        this.f16213f = z12;
        if (!z11 && !z12 && i10 != 5 && i10 != -1) {
            z10 = true;
        }
        this.f16216i = z10;
    }

    public final String d() {
        return this.f16208a;
    }

    public final int g() {
        return this.f16211d;
    }

    public final boolean h() {
        return this.f16213f;
    }

    public final boolean i() {
        return this.f16212e;
    }
}
