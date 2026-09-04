package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f3307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f3308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f3309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f3310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f3311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f3312f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static t a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(t tVar) {
            return new Person.Builder().setName(tVar.d()).setIcon(tVar.b() != null ? tVar.b().r() : null).setUri(tVar.e()).setKey(tVar.c()).setBot(tVar.f()).setImportant(tVar.g()).build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f3313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IconCompat f3314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f3315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f3316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3318f;

        public t a() {
            return new t(this);
        }

        public b b(boolean z10) {
            this.f3317e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f3314b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f3318f = z10;
            return this;
        }

        public b e(String str) {
            this.f3316d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f3313a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f3315c = str;
            return this;
        }
    }

    t(b bVar) {
        this.f3307a = bVar.f3313a;
        this.f3308b = bVar.f3314b;
        this.f3309c = bVar.f3315c;
        this.f3310d = bVar.f3316d;
        this.f3311e = bVar.f3317e;
        this.f3312f = bVar.f3318f;
    }

    public static t a(Person person) {
        return a.a(person);
    }

    public IconCompat b() {
        return this.f3308b;
    }

    public String c() {
        return this.f3310d;
    }

    public CharSequence d() {
        return this.f3307a;
    }

    public String e() {
        return this.f3309c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        String strC = c();
        String strC2 = tVar.c();
        if (strC == null && strC2 == null) {
            return Objects.equals(Objects.toString(d()), Objects.toString(tVar.d())) && Objects.equals(e(), tVar.e()) && Boolean.valueOf(f()).equals(Boolean.valueOf(tVar.f())) && Boolean.valueOf(g()).equals(Boolean.valueOf(tVar.g()));
        }
        return Objects.equals(strC, strC2);
    }

    public boolean f() {
        return this.f3311e;
    }

    public boolean g() {
        return this.f3312f;
    }

    public String h() {
        String str = this.f3309c;
        if (str != null) {
            return str;
        }
        if (this.f3307a == null) {
            return "";
        }
        return "name:" + ((Object) this.f3307a);
    }

    public int hashCode() {
        String strC = c();
        return strC != null ? strC.hashCode() : Objects.hash(d(), e(), Boolean.valueOf(f()), Boolean.valueOf(g()));
    }

    public Person i() {
        return a.b(this);
    }
}
