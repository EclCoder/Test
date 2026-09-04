package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class q extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f20003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i.n f20004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i.o f20005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f20007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20008f = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f20009a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f20009a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f20009a.getAdapter().v(i10)) {
                q.this.f20004b.a(this.f20009a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TextView f20011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final MaterialCalendarGridView f20012c;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(sb.g.f51791w);
            this.f20011b = textView;
            q0.n0(textView, true);
            this.f20012c = (MaterialCalendarGridView) linearLayout.findViewById(sb.g.f51783s);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    q(Context context, d dVar, com.google.android.material.datepicker.a aVar, g gVar, i.n nVar, i.o oVar) {
        n nVarO = aVar.o();
        n nVarI = aVar.i();
        n nVarN = aVar.n();
        if (nVarO.compareTo(nVarN) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (nVarN.compareTo(nVarI) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f20006d = (o.f19994e * i.J(context)) + (l.D(context) ? i.J(context) : 0);
        this.f20003a = aVar;
        this.f20004b = nVar;
        this.f20005c = oVar;
        this.f20007e = nVarN;
        setHasStableIds(true);
    }

    public static /* synthetic */ void f(q qVar, MaterialCalendarGridView materialCalendarGridView, int i10) {
        qVar.getClass();
        if (!materialCalendarGridView.hasFocus() || i10 == 0) {
            return;
        }
        materialCalendarGridView.setSelection(qVar.h(materialCalendarGridView.getAdapter(), i10));
    }

    private int h(o oVar, int i10) {
        if (i10 == 1) {
            int iC = oVar.c();
            return iC == -1 ? oVar.q() : iC;
        }
        int iB = oVar.b();
        return iB == -1 ? oVar.g() : iB;
    }

    private void n(final MaterialCalendarGridView materialCalendarGridView) {
        final int i10 = this.f20008f;
        this.f20008f = 0;
        materialCalendarGridView.post(new Runnable() { // from class: com.google.android.material.datepicker.p
            @Override // java.lang.Runnable
            public final void run() {
                q.f(this.f20000a, materialCalendarGridView, i10);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f20003a.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f20003a.o().n(i10).l();
    }

    n i(int i10) {
        return this.f20003a.o().n(i10);
    }

    CharSequence j(int i10) {
        return i(i10).j();
    }

    int k(n nVar) {
        return this.f20003a.o().o(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        n nVarN = this.f20003a.o().n(i10);
        bVar.f20011b.setText(nVarN.j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f20012c.findViewById(sb.g.f51783s);
        if (materialCalendarGridView.getAdapter() == null || !nVarN.equals(materialCalendarGridView.getAdapter().f19996a)) {
            o oVar = new o(nVarN, null, this.f20003a, null);
            materialCalendarGridView.setNumColumns(nVarN.f19990d);
            materialCalendarGridView.setAdapter((ListAdapter) oVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().u(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
        materialCalendarGridView.h(this.f20005c);
        boolean zD = l.D(bVar.itemView.getContext());
        if (zD || nVarN.equals(this.f20007e)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(393216);
        }
        if (zD || !nVarN.equals(this.f20007e)) {
            return;
        }
        n(materialCalendarGridView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(sb.i.C, viewGroup, false);
        if (!l.D(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f20006d));
        return new b(linearLayout, true);
    }

    void o(int i10) {
        this.f20008f = i10;
    }

    void p(n nVar) {
        if (nVar == null || nVar.equals(this.f20007e)) {
            return;
        }
        int iK = k(this.f20007e);
        this.f20007e = nVar;
        int iK2 = k(nVar);
        notifyItemChanged(iK);
        notifyItemChanged(iK2);
    }
}
