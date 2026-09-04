package com.hecorat.screenrecorder.free.activities.main_setting_drawer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.g;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.main_setting_drawer.LanguagesActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j0.k;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import lg.h;
import nh.j0;
import nh.l0;
import tf.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class LanguagesActivity extends ff.b implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f22839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22840d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    lg.a f22841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w f22842f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            LanguagesActivity.this.f22842f.B.setSelection(LanguagesActivity.this.f22840d);
            LanguagesActivity.this.f22842f.B.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class b extends ArrayAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f22844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f22845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer[] f22846c;

        b(Context context, int i10) {
            super(context, i10, LanguagesActivity.this.f22839c);
            Integer numValueOf = Integer.valueOf(R.drawable.ic_smartphone_green_24dp);
            Integer numValueOf2 = Integer.valueOf(R.drawable.ic_flag_arabic_group);
            Integer numValueOf3 = Integer.valueOf(R.drawable.ic_flag_azerbaijan);
            Integer numValueOf4 = Integer.valueOf(R.drawable.ic_flag_bulgarian);
            Integer numValueOf5 = Integer.valueOf(R.drawable.ic_flag_bengali);
            Integer numValueOf6 = Integer.valueOf(R.drawable.ic_flag_czech);
            Integer numValueOf7 = Integer.valueOf(R.drawable.ic_flag_german);
            Integer numValueOf8 = Integer.valueOf(R.drawable.ic_flag_greek);
            Integer numValueOf9 = Integer.valueOf(R.drawable.ic_flag_america);
            Integer numValueOf10 = Integer.valueOf(R.drawable.ic_flag_spanish);
            Integer numValueOf11 = Integer.valueOf(R.drawable.ic_flag_mexico);
            Integer numValueOf12 = Integer.valueOf(R.drawable.ic_flag_persian);
            Integer numValueOf13 = Integer.valueOf(R.drawable.ic_flag_finnish);
            Integer numValueOf14 = Integer.valueOf(R.drawable.ic_flag_philippines);
            Integer numValueOf15 = Integer.valueOf(R.drawable.ic_flag_french);
            Integer numValueOf16 = Integer.valueOf(R.drawable.ic_flag_hebrew);
            Integer numValueOf17 = Integer.valueOf(R.drawable.ic_flag_india);
            this.f22846c = new Integer[]{numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, numValueOf11, numValueOf12, numValueOf13, numValueOf14, numValueOf15, numValueOf16, numValueOf17, Integer.valueOf(R.drawable.ic_flag_hungary), Integer.valueOf(R.drawable.ic_flag_indonesia), Integer.valueOf(R.drawable.ic_flag_italian), Integer.valueOf(R.drawable.ic_flag_japanese), Integer.valueOf(R.drawable.ic_flag_cambodia), Integer.valueOf(R.drawable.ic_flag_korean), Integer.valueOf(R.drawable.ic_flag_malaysia), Integer.valueOf(R.drawable.ic_flag_myanmar), Integer.valueOf(R.drawable.ic_flag_netherlands), Integer.valueOf(R.drawable.ic_flag_norway), Integer.valueOf(R.drawable.ic_flag_polish), Integer.valueOf(R.drawable.ic_flag_brazilian), Integer.valueOf(R.drawable.ic_flag_portugal), Integer.valueOf(R.drawable.ic_flag_romanian), Integer.valueOf(R.drawable.ic_flag_russian), Integer.valueOf(R.drawable.ic_flag_slovak), Integer.valueOf(R.drawable.ic_flag_slovenian), Integer.valueOf(R.drawable.ic_flag_albanian), Integer.valueOf(R.drawable.ic_flag_serbia), Integer.valueOf(R.drawable.ic_flag_swedish), Integer.valueOf(R.drawable.ic_flag_tamil), numValueOf17, Integer.valueOf(R.drawable.ic_flag_thai), Integer.valueOf(R.drawable.ic_flag_turkish), Integer.valueOf(R.drawable.ic_flag_ukrainian), Integer.valueOf(R.drawable.ic_flag_uzbekistan), Integer.valueOf(R.drawable.ic_flag_pakistan), Integer.valueOf(R.drawable.ic_flag_vietnam), Integer.valueOf(R.drawable.ic_flag_china), Integer.valueOf(R.drawable.ic_flag_hongkong), Integer.valueOf(R.drawable.ic_flag_taiwan)};
            List listAsList = Arrays.asList(LanguagesActivity.this.getResources().getStringArray(R.array.translator));
            this.f22845b = listAsList;
            listAsList.set(0, l0.i().getDisplayLanguage());
            List listAsList2 = Arrays.asList(LanguagesActivity.this.getResources().getStringArray(R.array.display_languages));
            this.f22844a = listAsList2;
            listAsList2.set(0, LanguagesActivity.this.getString(R.string.device_language));
        }

        public static /* synthetic */ void a(b bVar, View view) {
            bVar.getClass();
            int i10 = Integer.parseInt(view.getTag().toString());
            if (i10 != LanguagesActivity.this.f22840d) {
                LanguagesActivity.this.I0(i10);
            }
            LanguagesActivity.this.finish();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.language_item, (ViewGroup) null);
            }
            TextView textView = (TextView) view.findViewById(R.id.tv_language);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_translator);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_flag);
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.rb_select);
            radioButton.setTag(Integer.valueOf(i10));
            radioButton.setChecked(i10 == LanguagesActivity.this.f22840d);
            if (radioButton.isChecked()) {
                radioButton.setButtonTintList(ColorStateList.valueOf(new h(getContext()).a().data));
            } else {
                radioButton.setButtonTintList(ColorStateList.valueOf(new h(getContext()).b().data));
            }
            textView.setText((CharSequence) this.f22844a.get(i10));
            textView2.setText((CharSequence) this.f22845b.get(i10));
            imageView.setImageResource(this.f22846c[i10].intValue());
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: com.hecorat.screenrecorder.free.activities.main_setting_drawer.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LanguagesActivity.b.a(this.f22856a, view2);
                }
            });
            return view;
        }
    }

    public static /* synthetic */ void B0(AppBarLayout appBarLayout, int i10) {
        if (appBarLayout.getHeight() + i10 == 0) {
            appBarLayout.setVisibility(8);
        }
    }

    public static /* synthetic */ void C0(LanguagesActivity languagesActivity, AdapterView adapterView, View view, int i10, long j10) {
        if (i10 != languagesActivity.f22840d) {
            languagesActivity.I0(i10);
            languagesActivity.finish();
        }
    }

    public static /* synthetic */ void D0(LanguagesActivity languagesActivity) {
        languagesActivity.f22842f.A.e(new AppBarLayout.g() { // from class: hf.g
            @Override // com.google.android.material.appbar.AppBarLayout.b
            public final void a(AppBarLayout appBarLayout, int i10) {
                LanguagesActivity.B0(appBarLayout, i10);
            }
        });
        languagesActivity.f22842f.A.C(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(int i10) {
        this.f22842f.C.setVisibility(0);
        wp.a.g("Start changing language", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putString("from", l0.e().toLanguageTag());
        if (i10 == 0) {
            androidx.appcompat.app.h.M(k.d());
        } else {
            androidx.appcompat.app.h.M(k.b((String) this.f22839c.get(i10)));
        }
        bundle.putString("to", l0.e().getLanguage());
        FirebaseAnalytics.getInstance(this).a("change_language", bundle);
    }

    private void J0(View view, ImageView imageView) {
        if (view.getId() != imageView.getId()) {
            imageView.setColorFilter(androidx.core.content.a.getColor(this, R.color.lesser_grey));
        }
        imageView.setClickable(false);
    }

    private void K0() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        u0(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: hf.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40347a.finish();
            }
        });
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getTag() != null) {
            j0.b(this, R.string.toast_thanks_for_feedback);
            Bundle bundle = new Bundle();
            bundle.putString("satisfaction", view.getTag().toString());
            try {
                bundle.putLong(CampaignEx.JSON_KEY_STAR, Integer.parseInt(view.getTag().toString()));
            } catch (NumberFormatException e10) {
                wp.a.e(e10);
            }
            FirebaseAnalytics.getInstance(this).a("rate_translation_" + l0.e().getLanguage(), bundle);
            J0(view, this.f22842f.E);
            J0(view, this.f22842f.F);
            J0(view, this.f22842f.G);
            J0(view, this.f22842f.H);
            J0(view, this.f22842f.I);
            new Handler().postDelayed(new Runnable() { // from class: hf.e
                @Override // java.lang.Runnable
                public final void run() {
                    LanguagesActivity.D0(this.f40345a);
                }
            }, 2000L);
        }
    }

    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AzRecorderApp.d().B(this);
        w wVar = (w) g.j(this, R.layout.activity_languages);
        this.f22842f = wVar;
        y0(wVar.B());
        K0();
        Locale localeE = l0.e();
        if (localeE.getLanguage().equals("en")) {
            this.f22842f.A.setExpanded(false);
            this.f22842f.A.setVisibility(8);
        } else {
            String displayName = localeE.getDisplayName(localeE);
            this.f22842f.D.setText(getString(R.string.translation_rating_question, displayName.substring(0, 1).toUpperCase(localeE) + displayName.substring(1)));
            this.f22842f.E.setOnClickListener(this);
            this.f22842f.F.setOnClickListener(this);
            this.f22842f.G.setOnClickListener(this);
            this.f22842f.H.setOnClickListener(this);
            this.f22842f.I.setOnClickListener(this);
        }
        this.f22839c = Arrays.asList(getResources().getStringArray(R.array.language_codes));
        String strF = l0.f();
        int iIndexOf = this.f22839c.indexOf(strF);
        if (iIndexOf != -1) {
            this.f22840d = iIndexOf;
        } else {
            int iIndexOf2 = this.f22839c.indexOf(new Locale(strF).getLanguage());
            this.f22840d = iIndexOf2 != -1 ? iIndexOf2 : 0;
        }
        this.f22842f.B.setAdapter((ListAdapter) new b(this, R.layout.language_item));
        this.f22842f.B.setNestedScrollingEnabled(true);
        this.f22842f.B.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: hf.f
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                LanguagesActivity.C0(this.f40346a, adapterView, view, i10, j10);
            }
        });
        this.f22842f.B.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.s, android.app.Activity
    public void onDestroy() {
        this.f22842f.C.setVisibility(8);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().l();
        return true;
    }
}
