package sf;

import android.content.SharedPreferences;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements kotlin.properties.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl.k f52374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f52376c;

    public b(fl.k preferences, String name, boolean z10) {
        s.h(preferences, "preferences");
        s.h(name, "name");
        this.f52374a = preferences;
        this.f52375b = name;
        this.f52376c = z10;
    }

    @Override // kotlin.properties.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean getValue(Object thisRef, zl.k property) {
        s.h(thisRef, "thisRef");
        s.h(property, "property");
        return Boolean.valueOf(((SharedPreferences) this.f52374a.getValue()).getBoolean(this.f52375b, this.f52376c));
    }

    public void b(Object thisRef, zl.k property, boolean z10) {
        s.h(thisRef, "thisRef");
        s.h(property, "property");
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f52374a.getValue()).edit();
        editorEdit.putBoolean(this.f52375b, z10);
        editorEdit.apply();
    }
}
