package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h extends RecyclerView.h implements Preference.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PreferenceGroup f6383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f6384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f6385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6386d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f6388f = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f6387e = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Preference.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f6390a;

        b(PreferenceGroup preferenceGroup) {
            this.f6390a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.e
        public boolean l(Preference preference) {
            this.f6390a.Z0(Integer.MAX_VALUE);
            h.this.d(preference);
            this.f6390a.S0();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f6394c;

        c(Preference preference) {
            this.f6394c = preference.getClass().getName();
            this.f6392a = preference.r();
            this.f6393b = preference.F();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f6392a == cVar.f6392a && this.f6393b == cVar.f6393b && TextUtils.equals(this.f6394c, cVar.f6394c);
        }

        public int hashCode() {
            return ((((527 + this.f6392a) * 31) + this.f6393b) * 31) + this.f6394c.hashCode();
        }
    }

    public h(PreferenceGroup preferenceGroup) {
        this.f6383a = preferenceGroup;
        preferenceGroup.y0(this);
        this.f6384b = new ArrayList();
        this.f6385c = new ArrayList();
        this.f6386d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).c1());
        } else {
            setHasStableIds(true);
        }
        m();
    }

    private androidx.preference.b f(PreferenceGroup preferenceGroup, List list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.j(), list, preferenceGroup.o());
        bVar.A0(new b(preferenceGroup));
        return bVar;
    }

    private List g(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iU0 = preferenceGroup.U0();
        int i10 = 0;
        for (int i11 = 0; i11 < iU0; i11++) {
            Preference preferenceT0 = preferenceGroup.T0(i11);
            if (preferenceT0.L()) {
                if (!j(preferenceGroup) || i10 < preferenceGroup.R0()) {
                    arrayList.add(preferenceT0);
                } else {
                    arrayList2.add(preferenceT0);
                }
                if (preferenceT0 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceT0;
                    if (!preferenceGroup2.V0()) {
                        continue;
                    } else {
                        if (j(preferenceGroup) && j(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : g(preferenceGroup2)) {
                            if (!j(preferenceGroup) || i10 < preferenceGroup.R0()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i10++;
                        }
                    }
                } else {
                    i10++;
                }
            }
        }
        if (j(preferenceGroup) && i10 > preferenceGroup.R0()) {
            arrayList.add(f(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void h(List list, PreferenceGroup preferenceGroup) {
        preferenceGroup.b1();
        int iU0 = preferenceGroup.U0();
        for (int i10 = 0; i10 < iU0; i10++) {
            Preference preferenceT0 = preferenceGroup.T0(i10);
            list.add(preferenceT0);
            c cVar = new c(preferenceT0);
            if (!this.f6386d.contains(cVar)) {
                this.f6386d.add(cVar);
            }
            if (preferenceT0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceT0;
                if (preferenceGroup2.V0()) {
                    h(list, preferenceGroup2);
                }
            }
            preferenceT0.y0(this);
        }
    }

    private boolean j(PreferenceGroup preferenceGroup) {
        return preferenceGroup.R0() != Integer.MAX_VALUE;
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference) {
        d(preference);
    }

    @Override // androidx.preference.Preference.c
    public void c(Preference preference) {
        int iIndexOf = this.f6385c.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.c
    public void d(Preference preference) {
        this.f6387e.removeCallbacks(this.f6388f);
        this.f6387e.post(this.f6388f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f6385c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        if (hasStableIds()) {
            return i(i10).o();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        c cVar = new c(i(i10));
        int iIndexOf = this.f6386d.indexOf(cVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.f6386d.size();
        this.f6386d.add(cVar);
        return size;
    }

    public Preference i(int i10) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return null;
        }
        return (Preference) this.f6385c.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(l lVar, int i10) {
        Preference preferenceI = i(i10);
        lVar.e();
        preferenceI.S(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public l onCreateViewHolder(ViewGroup viewGroup, int i10) {
        c cVar = (c) this.f6386d.get(i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, s.f6453a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(s.f6456b);
        if (drawable == null) {
            drawable = i.a.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(cVar.f6392a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            q0.p0(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i11 = cVar.f6393b;
            if (i11 != 0) {
                layoutInflaterFrom.inflate(i11, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new l(viewInflate);
    }

    void m() {
        Iterator it = this.f6384b.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).y0(null);
        }
        ArrayList arrayList = new ArrayList(this.f6384b.size());
        this.f6384b = arrayList;
        h(arrayList, this.f6383a);
        this.f6385c = g(this.f6383a);
        j jVarA = this.f6383a.A();
        if (jVarA != null) {
            jVarA.i();
        }
        notifyDataSetChanged();
        Iterator it2 = this.f6384b.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).d();
        }
    }
}
