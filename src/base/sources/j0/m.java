package j0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f41889a;

    m(Object obj) {
        this.f41889a = (LocaleList) obj;
    }

    @Override // j0.l
    public String a() {
        return this.f41889a.toLanguageTags();
    }

    @Override // j0.l
    public Object b() {
        return this.f41889a;
    }

    public boolean equals(Object obj) {
        return this.f41889a.equals(((l) obj).b());
    }

    @Override // j0.l
    public Locale get(int i10) {
        return this.f41889a.get(i10);
    }

    public int hashCode() {
        return this.f41889a.hashCode();
    }

    @Override // j0.l
    public boolean isEmpty() {
        return this.f41889a.isEmpty();
    }

    @Override // j0.l
    public int size() {
        return this.f41889a.size();
    }

    public String toString() {
        return this.f41889a.toString();
    }
}
