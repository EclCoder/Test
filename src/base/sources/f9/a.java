package f9;

import c9.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f38366e = new C0576a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f38367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f38368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f38369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38370d;

    /* JADX INFO: renamed from: f9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0576a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f38371a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f38372b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f38373c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f38374d = "";

        C0576a() {
        }

        public C0576a a(d dVar) {
            this.f38372b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f38371a, Collections.unmodifiableList(this.f38372b), this.f38373c, this.f38374d);
        }

        public C0576a c(String str) {
            this.f38374d = str;
            return this;
        }

        public C0576a d(b bVar) {
            this.f38373c = bVar;
            return this;
        }

        public C0576a e(f fVar) {
            this.f38371a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f38367a = fVar;
        this.f38368b = list;
        this.f38369c = bVar;
        this.f38370d = str;
    }

    public static C0576a e() {
        return new C0576a();
    }

    public String a() {
        return this.f38370d;
    }

    public b b() {
        return this.f38369c;
    }

    public List c() {
        return this.f38368b;
    }

    public f d() {
        return this.f38367a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
