package f9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f38392c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f38394b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f38395a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f38396b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f38395a, Collections.unmodifiableList(this.f38396b));
        }

        public a b(List list) {
            this.f38396b = list;
            return this;
        }

        public a c(String str) {
            this.f38395a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f38393a = str;
        this.f38394b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f38394b;
    }

    public String b() {
        return this.f38393a;
    }
}
