package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f6351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence[] f6352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence[] f6353k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            c cVar = c.this;
            cVar.f6351i = i10;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference B() {
        return (ListPreference) t();
    }

    public static c C(String str) {
        c cVar = new c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // androidx.preference.f, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6351i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f6352j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f6353k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceB = B();
        if (listPreferenceB.V0() == null || listPreferenceB.X0() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f6351i = listPreferenceB.U0(listPreferenceB.Y0());
        this.f6352j = listPreferenceB.V0();
        this.f6353k = listPreferenceB.X0();
    }

    @Override // androidx.preference.f, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f6351i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f6352j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f6353k);
    }

    @Override // androidx.preference.f
    public void x(boolean z10) {
        int i10;
        if (!z10 || (i10 = this.f6351i) < 0) {
            return;
        }
        String string = this.f6353k[i10].toString();
        ListPreference listPreferenceB = B();
        if (listPreferenceB.c(string)) {
            listPreferenceB.e1(string);
        }
    }

    @Override // androidx.preference.f
    protected void y(androidx.appcompat.app.c.a aVar) {
        super.y(aVar);
        aVar.l(this.f6352j, this.f6351i, new a());
        aVar.j(null, null);
    }
}
