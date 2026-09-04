package com.fasterxml.jackson.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b extends k implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final int f16132i = a.d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final int f16133j = e.a.d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final int f16134k = c.a.d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f16135l = i8.e.f41192h;
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final transient h8.b f16136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final transient h8.a f16137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f16138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f16139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f16140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected j f16141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f16142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final char f16143h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f16149a;

        a(boolean z10) {
            this.f16149a = z10;
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
            return this.f16149a;
        }

        public boolean h(int i10) {
            return (i10 & i()) != 0;
        }

        public int i() {
            return 1 << ordinal();
        }
    }

    public b() {
        this(null);
    }

    public b A(c.a aVar) {
        this.f16140e = aVar.i() | this.f16140e;
        return this;
    }

    protected com.fasterxml.jackson.core.io.b a(Object obj, boolean z10) {
        return new com.fasterxml.jackson.core.io.b(m(), obj, z10);
    }

    protected c b(Writer writer, com.fasterxml.jackson.core.io.b bVar) {
        g8.j jVar = new g8.j(bVar, this.f16140e, null, writer, this.f16143h);
        int i10 = this.f16142g;
        if (i10 > 0) {
            jVar.e1(i10);
        }
        j jVar2 = this.f16141f;
        if (jVar2 != f16135l) {
            jVar.f1(jVar2);
        }
        return jVar;
    }

    protected e c(InputStream inputStream, com.fasterxml.jackson.core.io.b bVar) {
        return new g8.a(bVar, inputStream).c(this.f16139d, null, this.f16137b, this.f16136a, this.f16138c);
    }

    protected e d(Reader reader, com.fasterxml.jackson.core.io.b bVar) {
        return new g8.g(bVar, this.f16139d, reader, null, this.f16136a.q(this.f16138c));
    }

    protected e e(char[] cArr, int i10, int i11, com.fasterxml.jackson.core.io.b bVar, boolean z10) {
        return new g8.g(bVar, this.f16139d, null, null, this.f16136a.q(this.f16138c), cArr, i10, i10 + i11, z10);
    }

    protected c g(OutputStream outputStream, com.fasterxml.jackson.core.io.b bVar) {
        g8.h hVar = new g8.h(bVar, this.f16140e, null, outputStream, this.f16143h);
        int i10 = this.f16142g;
        if (i10 > 0) {
            hVar.e1(i10);
        }
        j jVar = this.f16141f;
        if (jVar != f16135l) {
            hVar.f1(jVar);
        }
        return hVar;
    }

    protected Writer h(OutputStream outputStream, com.fasterxml.jackson.core.a aVar, com.fasterxml.jackson.core.io.b bVar) {
        return aVar == com.fasterxml.jackson.core.a.UTF8 ? new com.fasterxml.jackson.core.io.i(bVar, outputStream) : new OutputStreamWriter(outputStream, aVar.g());
    }

    public i8.a m() {
        return a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.h(this.f16138c) ? i8.b.a() : new i8.a();
    }

    public boolean n() {
        return true;
    }

    public final b o(c.a aVar, boolean z10) {
        return z10 ? A(aVar) : z(aVar);
    }

    public c p(OutputStream outputStream, com.fasterxml.jackson.core.a aVar) {
        com.fasterxml.jackson.core.io.b bVarA = a(outputStream, false);
        bVarA.r(aVar);
        return aVar == com.fasterxml.jackson.core.a.UTF8 ? g(j(outputStream, bVarA), bVarA) : b(l(h(outputStream, aVar, bVarA), bVarA), bVarA);
    }

    public c q(Writer writer) {
        com.fasterxml.jackson.core.io.b bVarA = a(writer, false);
        return b(l(writer, bVarA), bVarA);
    }

    public c r(OutputStream outputStream, com.fasterxml.jackson.core.a aVar) {
        return p(outputStream, aVar);
    }

    protected Object readResolve() {
        return new b(this, null);
    }

    public c s(Writer writer) {
        return q(writer);
    }

    public e t(InputStream inputStream) {
        return w(inputStream);
    }

    public e u(Reader reader) {
        return x(reader);
    }

    public e v(String str) {
        return y(str);
    }

    public e w(InputStream inputStream) {
        com.fasterxml.jackson.core.io.b bVarA = a(inputStream, false);
        return c(i(inputStream, bVarA), bVarA);
    }

    public e x(Reader reader) {
        com.fasterxml.jackson.core.io.b bVarA = a(reader, false);
        return d(k(reader, bVarA), bVarA);
    }

    public e y(String str) {
        int length = str.length();
        if (length > 32768 || !n()) {
            return x(new StringReader(str));
        }
        com.fasterxml.jackson.core.io.b bVarA = a(str, true);
        char[] cArrG = bVarA.g(length);
        str.getChars(0, length, cArrG, 0);
        return e(cArrG, 0, length, bVarA, true);
    }

    public b z(c.a aVar) {
        this.f16140e = (~aVar.i()) & this.f16140e;
        return this;
    }

    public b(h hVar) {
        this.f16136a = h8.b.m();
        this.f16137b = h8.a.B();
        this.f16138c = f16132i;
        this.f16139d = f16133j;
        this.f16140e = f16134k;
        this.f16141f = f16135l;
        this.f16143h = '\"';
    }

    protected b(b bVar, h hVar) {
        this.f16136a = h8.b.m();
        this.f16137b = h8.a.B();
        this.f16138c = f16132i;
        this.f16139d = f16133j;
        this.f16140e = f16134k;
        this.f16141f = f16135l;
        this.f16138c = bVar.f16138c;
        this.f16139d = bVar.f16139d;
        this.f16140e = bVar.f16140e;
        this.f16141f = bVar.f16141f;
        this.f16142g = bVar.f16142g;
        this.f16143h = bVar.f16143h;
    }

    protected final InputStream i(InputStream inputStream, com.fasterxml.jackson.core.io.b bVar) {
        return inputStream;
    }

    protected final OutputStream j(OutputStream outputStream, com.fasterxml.jackson.core.io.b bVar) {
        return outputStream;
    }

    protected final Reader k(Reader reader, com.fasterxml.jackson.core.io.b bVar) {
        return reader;
    }

    protected final Writer l(Writer writer, com.fasterxml.jackson.core.io.b bVar) {
        return writer;
    }
}
