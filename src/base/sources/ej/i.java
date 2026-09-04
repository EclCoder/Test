package ej;

import fl.p;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37929b;

    public i(String value) {
        s.h(value, "value");
        this.f37929b = value;
    }

    @Override // ej.b
    public int a() {
        throw new p("An operation is not implemented: Not yet implemented");
    }

    @Override // ej.b
    public k b() {
        return k.STRING;
    }

    @Override // ej.b
    public void c(InputStream input) {
        s.h(input, "input");
        throw new p("An operation is not implemented: Not yet implemented");
    }

    @Override // ej.b
    public void e(OutputStream output) {
        s.h(output, "output");
        throw new p("An operation is not implemented: Not yet implemented");
    }

    public final String g() {
        return this.f37929b;
    }

    public /* synthetic */ i(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
