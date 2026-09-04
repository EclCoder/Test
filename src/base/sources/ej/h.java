package ej;

import fl.p;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f37928b;

    public h(HashMap properties) {
        s.h(properties, "properties");
        this.f37928b = properties;
    }

    @Override // ej.b
    public int a() {
        throw new p("An operation is not implemented: Not yet implemented");
    }

    @Override // ej.b
    public k b() {
        return k.OBJECT;
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

    public final b g(String name) {
        s.h(name, "name");
        for (Map.Entry entry : this.f37928b.entrySet()) {
            if (s.c(((i) entry.getKey()).g(), name)) {
                return (b) entry.getValue();
            }
        }
        return null;
    }

    public /* synthetic */ h(HashMap map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
