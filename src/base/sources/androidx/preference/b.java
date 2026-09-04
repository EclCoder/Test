package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b extends Preference {
    private long Q;

    b(Context context, List list, long j10) {
        super(context);
        O0();
        P0(list);
        this.Q = j10 + 1000000;
    }

    private void O0() {
        x0(p.f6443a);
        t0(n.f6436a);
        F0(q.f6448b);
        B0(999);
    }

    private void P0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequenceE = preference.E();
            boolean z10 = preference instanceof PreferenceGroup;
            if (z10 && !TextUtils.isEmpty(charSequenceE)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.t())) {
                if (z10) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceE)) {
                string = string == null ? charSequenceE : j().getString(q.f6451e, string, charSequenceE);
            }
        }
        D0(string);
    }

    @Override // androidx.preference.Preference
    public void S(l lVar) {
        super.S(lVar);
        lVar.f(false);
    }

    @Override // androidx.preference.Preference
    long o() {
        return this.Q;
    }
}
