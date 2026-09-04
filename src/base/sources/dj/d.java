package dj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f36946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LinkedHashMap properties) {
        super(properties);
        s.h(properties, "properties");
        this.f36946d = properties;
        i(g() + 4);
    }

    @Override // dj.h, dj.b
    public l b() {
        return l.ECMA_ARRAY;
    }

    @Override // dj.h, dj.b
    public void c(InputStream input) throws IOException {
        s.h(input, "input");
        this.f36947e = tj.e.e(input);
        super.c(input);
        i(g() + 4);
    }

    @Override // dj.h, dj.b
    public void e(OutputStream output) throws IOException {
        s.h(output, "output");
        tj.e.l(output, this.f36947e);
        super.e(output);
    }

    @Override // dj.h
    public void j(String name, double d10) {
        s.h(name, "name");
        super.j(name, d10);
        this.f36947e = this.f36946d.size();
    }

    @Override // dj.h
    public void l(String name, String data) {
        s.h(name, "name");
        s.h(data, "data");
        super.l(name, data);
        this.f36947e = this.f36946d.size();
    }

    @Override // dj.h
    public void m(String name, boolean z10) {
        s.h(name, "name");
        super.m(name, z10);
        this.f36947e = this.f36946d.size();
    }

    @Override // dj.h
    public String toString() {
        return "AmfEcmaArray length: " + this.f36947e + ", properties: " + this.f36946d;
    }

    public /* synthetic */ d(LinkedHashMap linkedHashMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
    }
}
