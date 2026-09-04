package com.mbridge.msdk.dycreator.wrapper;

import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class DyOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f30066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f30067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CampaignEx f30068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DyAdType f30069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f30077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f30079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f30080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f30082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DyCountDownListenerWrapper f30083r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder implements IViewOptionBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f30084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f30085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f30086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private DyAdType f30087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f30088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f30089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f30090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f30091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f30092i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f30093j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f30094k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f30095l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f30096m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f30097n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f30098o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f30099p;

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder adChoiceLink(String str) {
            this.f30089f = str;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public DyOption build() {
            return new DyOption(this);
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder campaignEx(CampaignEx campaignEx) {
            this.f30086c = campaignEx;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder canSkip(boolean z10) {
            this.f30088e = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder countDownTime(int i10) {
            this.f30098o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder dyAdType(DyAdType dyAdType) {
            this.f30087d = dyAdType;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder file(File file) {
            this.f30085b = file;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder fileDirs(List<String> list) {
            this.f30084a = list;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isApkInfoVisible(boolean z10) {
            this.f30093j = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isClickButtonVisible(boolean z10) {
            this.f30091h = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isLogoVisible(boolean z10) {
            this.f30094k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isScreenClick(boolean z10) {
            this.f30090g = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder isShakeVisible(boolean z10) {
            this.f30092i = z10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder orientation(int i10) {
            this.f30097n = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeStrenght(int i10) {
            this.f30095l = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder shakeTime(int i10) {
            this.f30096m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DyOption.IViewOptionBuilder
        public IViewOptionBuilder templateType(int i10) {
            this.f30099p = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface IViewOptionBuilder {
        IViewOptionBuilder adChoiceLink(String str);

        DyOption build();

        IViewOptionBuilder campaignEx(CampaignEx campaignEx);

        IViewOptionBuilder canSkip(boolean z10);

        IViewOptionBuilder countDownTime(int i10);

        IViewOptionBuilder dyAdType(DyAdType dyAdType);

        IViewOptionBuilder file(File file);

        IViewOptionBuilder fileDirs(List<String> list);

        IViewOptionBuilder isApkInfoVisible(boolean z10);

        IViewOptionBuilder isClickButtonVisible(boolean z10);

        IViewOptionBuilder isLogoVisible(boolean z10);

        IViewOptionBuilder isScreenClick(boolean z10);

        IViewOptionBuilder isShakeVisible(boolean z10);

        IViewOptionBuilder orientation(int i10);

        IViewOptionBuilder shakeStrenght(int i10);

        IViewOptionBuilder shakeTime(int i10);

        IViewOptionBuilder templateType(int i10);
    }

    public DyOption(Builder builder) {
        this.f30066a = builder.f30084a;
        this.f30067b = builder.f30085b;
        this.f30068c = builder.f30086c;
        this.f30069d = builder.f30087d;
        this.f30072g = builder.f30088e;
        this.f30070e = builder.f30089f;
        this.f30071f = builder.f30090g;
        this.f30073h = builder.f30091h;
        this.f30075j = builder.f30093j;
        this.f30074i = builder.f30092i;
        this.f30076k = builder.f30094k;
        this.f30077l = builder.f30095l;
        this.f30078m = builder.f30096m;
        this.f30079n = builder.f30097n;
        this.f30080o = builder.f30098o;
        this.f30082q = builder.f30099p;
    }

    public String getAdChoiceLink() {
        return this.f30070e;
    }

    public CampaignEx getCampaignEx() {
        return this.f30068c;
    }

    public int getCountDownTime() {
        return this.f30080o;
    }

    public int getCurrentCountDown() {
        return this.f30081p;
    }

    public DyAdType getDyAdType() {
        return this.f30069d;
    }

    public File getFile() {
        return this.f30067b;
    }

    public List<String> getFileDirs() {
        return this.f30066a;
    }

    public int getOrientation() {
        return this.f30079n;
    }

    public int getShakeStrenght() {
        return this.f30077l;
    }

    public int getShakeTime() {
        return this.f30078m;
    }

    public int getTemplateType() {
        return this.f30082q;
    }

    public boolean isApkInfoVisible() {
        return this.f30075j;
    }

    public boolean isCanSkip() {
        return this.f30072g;
    }

    public boolean isClickButtonVisible() {
        return this.f30073h;
    }

    public boolean isClickScreen() {
        return this.f30071f;
    }

    public boolean isLogoVisible() {
        return this.f30076k;
    }

    public boolean isShakeVisible() {
        return this.f30074i;
    }

    public void setDyCountDownListener(int i10) {
        DyCountDownListenerWrapper dyCountDownListenerWrapper = this.f30083r;
        if (dyCountDownListenerWrapper != null) {
            dyCountDownListenerWrapper.getCountDownValue(i10);
        }
        this.f30081p = i10;
    }

    public void setDyCountDownListenerWrapper(DyCountDownListenerWrapper dyCountDownListenerWrapper) {
        this.f30083r = dyCountDownListenerWrapper;
    }
}
