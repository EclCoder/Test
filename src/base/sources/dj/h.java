package dj;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f36951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36952c;

    public h(LinkedHashMap properties) {
        s.h(properties, "properties");
        this.f36951b = properties;
        Iterator it = properties.entrySet().iterator();
        while (true) {
            int i10 = 1;
            if (!it.hasNext()) {
                this.f36952c += new i(false, i10, null).a();
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                int iA = this.f36952c + ((k) entry.getKey()).a();
                this.f36952c = iA;
                this.f36952c = iA + ((b) entry.getValue()).a() + 1;
            }
        }
    }

    @Override // dj.b
    public int a() {
        return this.f36952c;
    }

    @Override // dj.b
    public l b() {
        return l.OBJECT;
    }

    @Override // dj.b
    public void c(InputStream input) throws IOException {
        s.h(input, "input");
        this.f36951b.clear();
        this.f36952c = 0;
        i iVar = new i(false, 1, null);
        InputStream bufferedInputStream = input.markSupported() ? input : new BufferedInputStream(input);
        while (!iVar.g()) {
            bufferedInputStream.mark(iVar.a());
            iVar.c(input);
            if (iVar.g()) {
                this.f36952c += iVar.a();
            } else {
                bufferedInputStream.reset();
                k kVar = new k(null, 1, null);
                kVar.c(input);
                this.f36952c += kVar.a();
                b bVarA = b.f36943a.a(input);
                this.f36952c += bVarA.a() + 1;
                this.f36951b.put(kVar, bVarA);
            }
        }
    }

    @Override // dj.b
    public void e(OutputStream output) throws IOException {
        s.h(output, "output");
        for (Map.Entry entry : this.f36951b.entrySet()) {
            ((k) entry.getKey()).e(output);
            ((b) entry.getValue()).f(output);
            ((b) entry.getValue()).e(output);
        }
        new i(false, 1, null).e(output);
    }

    protected final int g() {
        return this.f36952c;
    }

    public final b h(String name) {
        s.h(name, "name");
        for (Map.Entry entry : this.f36951b.entrySet()) {
            if (s.c(((k) entry.getKey()).g(), name)) {
                return (b) entry.getValue();
            }
        }
        return null;
    }

    protected final void i(int i10) {
        this.f36952c = i10;
    }

    public void j(String name, double d10) {
        s.h(name, "name");
        k kVar = new k(name);
        g gVar = new g(d10);
        this.f36951b.put(kVar, gVar);
        int iA = this.f36952c + kVar.a();
        this.f36952c = iA;
        this.f36952c = iA + gVar.a() + 1;
    }

    public void k(String name, b data) {
        s.h(name, "name");
        s.h(data, "data");
        k kVar = new k(name);
        this.f36951b.put(kVar, data);
        int iA = this.f36952c + kVar.a();
        this.f36952c = iA;
        this.f36952c = iA + data.a() + 1;
    }

    public void l(String name, String data) {
        s.h(name, "name");
        s.h(data, "data");
        k kVar = new k(name);
        k kVar2 = new k(data);
        this.f36951b.put(kVar, kVar2);
        int iA = this.f36952c + kVar.a();
        this.f36952c = iA;
        this.f36952c = iA + kVar2.a() + 1;
    }

    public void m(String name, boolean z10) {
        s.h(name, "name");
        k kVar = new k(name);
        a aVar = new a(z10);
        this.f36951b.put(kVar, aVar);
        int iA = this.f36952c + kVar.a();
        this.f36952c = iA;
        this.f36952c = iA + aVar.a() + 1;
    }

    public String toString() {
        return "AmfObject properties: " + this.f36951b;
    }

    public /* synthetic */ h(LinkedHashMap linkedHashMap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
    }
}
