package dj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f36955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36956c;

    public j(List items) {
        s.h(items, "items");
        this.f36955b = items;
        this.f36956c += 4;
        Iterator it = items.iterator();
        while (it.hasNext()) {
            this.f36956c += ((b) it.next()).a() + 1;
        }
    }

    @Override // dj.b
    public int a() {
        return this.f36956c;
    }

    @Override // dj.b
    public l b() {
        return l.STRICT_ARRAY;
    }

    @Override // dj.b
    public void c(InputStream input) {
        s.h(input, "input");
        this.f36955b.clear();
        this.f36956c = 0;
        int iE = tj.e.e(input);
        this.f36956c += 4;
        for (int i10 = 0; i10 < iE; i10++) {
            b bVarA = b.f36943a.a(input);
            this.f36956c += bVarA.a() + 1;
            this.f36955b.add(bVarA);
        }
    }

    @Override // dj.b
    public void e(OutputStream output) throws IOException {
        s.h(output, "output");
        tj.e.l(output, this.f36955b.size());
        for (b bVar : this.f36955b) {
            bVar.f(output);
            bVar.e(output);
        }
    }

    public String toString() {
        String string = Arrays.toString(this.f36955b.toArray(new b[0]));
        s.g(string, "toString(...)");
        return "AmfStrictArray items: " + string;
    }

    public /* synthetic */ j(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
