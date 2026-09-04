package com.hecorat.screenrecorder.free.activities.main_setting_drawer;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import androidx.databinding.g;
import com.hecorat.screenrecorder.free.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tf.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class FAQActivity extends ff.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f22834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap f22835d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends BaseExpandableListAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f22837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap f22838c;

        a(Context context, List list, HashMap map) {
            this.f22836a = context;
            this.f22837b = list;
            this.f22838c = map;
        }

        public static /* synthetic */ void a(a aVar, View view) {
            aVar.getClass();
            if (view.getTag() != null) {
                try {
                    int i10 = Integer.parseInt(view.getTag().toString());
                    Intent intent = new Intent(aVar.f22836a, (Class<?>) HelpActivity.class);
                    intent.putExtra("question_id", i10);
                    aVar.f22836a.startActivity(intent);
                } catch (NumberFormatException unused) {
                }
            }
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getChild(int i10, int i11) {
            return ((List) this.f22838c.get(this.f22837b.get(i10))).get(i11);
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i10, int i11) {
            return i11;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getChildView(int i10, int i11, boolean z10, View view, ViewGroup viewGroup) {
            String str = (String) getChild(i10, i11);
            if (view == null) {
                view = ((LayoutInflater) this.f22836a.getSystemService("layout_inflater")).inflate(R.layout.faq_item, viewGroup, false);
            }
            ((TextView) view.findViewById(R.id.tv_question)).setText(str);
            View viewFindViewById = view.findViewById(R.id.divider);
            if (i11 == getChildrenCount(i10) - 1) {
                viewFindViewById.setVisibility(8);
            } else {
                viewFindViewById.setVisibility(0);
            }
            view.setTag(String.valueOf((i10 * 100) + i11));
            view.setOnClickListener(new View.OnClickListener() { // from class: com.hecorat.screenrecorder.free.activities.main_setting_drawer.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FAQActivity.a.a(this.f22855a, view2);
                }
            });
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i10) {
            return ((List) this.f22838c.get(this.f22837b.get(i10))).size();
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getGroup(int i10) {
            return this.f22837b.get(i10);
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            return this.f22837b.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i10) {
            return i10;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i10, boolean z10, View view, ViewGroup viewGroup) {
            String str = (String) getGroup(i10);
            if (view == null) {
                view = ((LayoutInflater) this.f22836a.getSystemService("layout_inflater")).inflate(R.layout.faq_group, viewGroup, false);
            }
            ((TextView) view.findViewById(R.id.lblListHeader)).setText(str);
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i10, int i11) {
            return false;
        }
    }

    private void B0() {
        this.f22834c = new ArrayList(Arrays.asList(getResources().getStringArray(R.array.faq_categories)));
        this.f22835d = new HashMap();
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.faq_questions);
        int length = typedArrayObtainTypedArray.length();
        String[][] strArr = new String[length][];
        for (int i10 = 0; i10 < length; i10++) {
            int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
            if (resourceId > 0) {
                strArr[i10] = getResources().getStringArray(resourceId);
                this.f22835d.put((String) this.f22834c.get(i10), new ArrayList(Arrays.asList(strArr[i10])));
            }
        }
        typedArrayObtainTypedArray.recycle();
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k kVar = (k) g.j(this, R.layout.activity_faq);
        y0(kVar.C);
        u0(kVar.D);
        kVar.D.setNavigationOnClickListener(new View.OnClickListener() { // from class: hf.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40343a.getOnBackPressedDispatcher().l();
            }
        });
        setTitle(getString(R.string.faq));
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
        }
        B0();
        kVar.B.setAdapter(new a(this, this.f22834c, this.f22835d));
        for (int i10 = 0; i10 < this.f22834c.size(); i10++) {
            kVar.B.expandGroup(i10);
        }
    }
}
