package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f16170a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f16187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16188b = 1 << ordinal();

        a(boolean z10) {
            this.f16187a = z10;
        }

        public static int d() {
            int i10 = 0;
            for (a aVar : values()) {
                if (aVar.g()) {
                    i10 |= aVar.i();
                }
            }
            return i10;
        }

        public boolean g() {
            return this.f16187a;
        }

        public boolean h(int i10) {
            return (i10 & this.f16188b) != 0;
        }

        public int i() {
            return this.f16188b;
        }
    }

    protected e(int i10) {
        this.f16170a = i10;
    }

    protected JsonParseException c(String str) {
        return new JsonParseException(this, str).h(null);
    }

    public abstract long c0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract BigInteger d();

    public short d0() throws InputCoercionException {
        int iT = t();
        if (iT < -32768 || iT > 32767) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", g0()), g.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) iT;
    }

    public abstract String g0();

    public byte h() throws InputCoercionException {
        int iT = t();
        if (iT < -128 || iT > 255) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", g0()), g.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) iT;
    }

    public boolean i0(a aVar) {
        return aVar.h(this.f16170a);
    }

    public abstract d k();

    public abstract String l();

    public abstract g m();

    public abstract g m0();

    public abstract e p0();

    public abstract BigDecimal q();

    public abstract double r();

    public abstract float s();

    public abstract int t();
}
