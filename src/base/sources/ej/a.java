package ej;

import fl.p;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f37923b;

    public a(List items) {
        s.h(items, "items");
        this.f37923b = items;
    }

    @Override // ej.b
    public int a() {
        throw new p("An operation is not implemented: Not yet implemented");
    }

    @Override // ej.b
    public k b() {
        return k.ARRAY;
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

    public /* synthetic */ a(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
