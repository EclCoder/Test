package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class w extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f20019a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final TextView f20020b;

        a(TextView textView) {
            super(textView);
            this.f20020b = textView;
        }
    }

    w(i iVar) {
        this.f20019a = iVar;
    }

    int f(int i10) {
        return i10 - this.f20019a.F().o().f19989c;
    }

    int g(int i10) {
        return this.f20019a.F().o().f19989c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f20019a.F().p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i10) {
        int iG = g(i10);
        aVar.f20020b.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iG)));
        TextView textView = aVar.f20020b;
        textView.setContentDescription(e.e(textView.getContext(), iG));
        c cVarG = this.f20019a.G();
        if (v.g().get(1) == iG) {
            b bVar = cVarG.f19900f;
        } else {
            b bVar2 = cVarG.f19898d;
        }
        this.f20019a.I();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(sb.i.E, viewGroup, false));
    }
}
