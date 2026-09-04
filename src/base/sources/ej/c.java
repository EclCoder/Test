package ej;

import fl.p;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f37926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HashMap properties) {
        super(properties);
        s.h(properties, "properties");
        this.f37926c = properties;
    }

    @Override // ej.h, ej.b
    public int a() {
        throw new p("An operation is not implemented: Not yet implemented");
    }

    @Override // ej.h, ej.b
    public k b() {
        return k.DICTIONARY;
    }

    @Override // ej.h, ej.b
    public void c(InputStream input) {
        s.h(input, "input");
        throw new p("An operation is not implemented: Not yet implemented");
    }

    @Override // ej.h, ej.b
    public void e(OutputStream output) {
        s.h(output, "output");
        throw new p("An operation is not implemented: Not yet implemented");
    }

    public /* synthetic */ c(HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
