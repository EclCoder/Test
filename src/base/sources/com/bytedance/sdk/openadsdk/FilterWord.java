package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class FilterWord {
    private List<FilterWord> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13029hn;
    private String hnj;
    private boolean qor;

    public FilterWord(String str, String str2) {
        this.hnj = str;
        this.f13029hn = str2;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.gjv == null) {
            this.gjv = new ArrayList();
        }
        this.gjv.add(filterWord);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.hnj;
    }

    public boolean getIsSelected() {
        return this.qor;
    }

    public String getName() {
        return this.f13029hn;
    }

    public List<FilterWord> getOptions() {
        return this.gjv;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.gjv;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.hnj) || TextUtils.isEmpty(this.f13029hn)) ? false : true;
    }

    public void setId(String str) {
        this.hnj = str;
    }

    public void setIsSelected(boolean z10) {
        this.qor = z10;
    }

    public void setName(String str) {
        this.f13029hn = str;
    }

    public FilterWord() {
    }
}
