package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Set f6355i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f6356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    CharSequence[] f6357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    CharSequence[] f6358l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements DialogInterface.OnMultiChoiceClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
            if (z10) {
                d dVar = d.this;
                dVar.f6356j = dVar.f6355i.add(dVar.f6358l[i10].toString()) | dVar.f6356j;
            } else {
                d dVar2 = d.this;
                dVar2.f6356j = dVar2.f6355i.remove(dVar2.f6358l[i10].toString()) | dVar2.f6356j;
            }
        }
    }

    private MultiSelectListPreference B() {
        return (MultiSelectListPreference) t();
    }

    public static d C(String str) {
        d dVar = new d();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // androidx.preference.f, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6355i.clear();
            this.f6355i.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f6356j = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f6357k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f6358l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceB = B();
        if (multiSelectListPreferenceB.U0() == null || multiSelectListPreferenceB.V0() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f6355i.clear();
        this.f6355i.addAll(multiSelectListPreferenceB.W0());
        this.f6356j = false;
        this.f6357k = multiSelectListPreferenceB.U0();
        this.f6358l = multiSelectListPreferenceB.V0();
    }

    @Override // androidx.preference.f, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f6355i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f6356j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f6357k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f6358l);
    }

    @Override // androidx.preference.f
    public void x(boolean z10) {
        if (z10 && this.f6356j) {
            MultiSelectListPreference multiSelectListPreferenceB = B();
            if (multiSelectListPreferenceB.c(this.f6355i)) {
                multiSelectListPreferenceB.X0(this.f6355i);
            }
        }
        this.f6356j = false;
    }

    @Override // androidx.preference.f
    protected void y(androidx.appcompat.app.c.a aVar) {
        super.y(aVar);
        int length = this.f6358l.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f6355i.contains(this.f6358l[i10].toString());
        }
        aVar.g(this.f6357k, zArr, new a());
    }
}
