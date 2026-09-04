package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.Flushable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected i f16150a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f16162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16163b = 1 << ordinal();

        a(boolean z10) {
            this.f16162a = z10;
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
            return this.f16162a;
        }

        public boolean h(int i10) {
            return (i10 & this.f16163b) != 0;
        }

        public int i() {
            return this.f16163b;
        }
    }

    protected c() {
    }

    public abstract void F0(char c10);

    public abstract void K0(j jVar);

    public abstract void N0(String str);

    public abstract void T0(char[] cArr, int i10, int i11);

    public abstract void U0();

    public abstract void V0();

    public abstract void W0(String str);

    protected void c(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public abstract void c0(float f10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    protected final void d() {
        i8.k.a();
    }

    public abstract void d0(int i10);

    @Override // java.io.Flushable
    public abstract void flush();

    public abstract void g0(long j10);

    public i h() {
        return this.f16150a;
    }

    public c i(i iVar) {
        this.f16150a = iVar;
        return this;
    }

    public abstract void i0(String str);

    public abstract c k();

    public abstract void l(boolean z10);

    public abstract void m();

    public abstract void m0(BigDecimal bigDecimal);

    public abstract void p0(BigInteger bigInteger);

    public abstract void q();

    public abstract void r(String str);

    public abstract void s();

    public abstract void t(double d10);
}
