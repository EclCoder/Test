package com.mbridge.msdk.video.module.listener.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class m extends o {
    private Timer A;
    private Handler B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private MBridgeVideoView.u H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private MBridgeVideoView f34685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private MBridgeContainerView f34686y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f34687z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends TimerTask {

        /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0477a implements Runnable {
            RunnableC0477a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.f34686y.showVideoClickView(-1);
                m.this.f34685x.soundOperate(0, 2);
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                m.this.B.post(new RunnableC0477a());
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.listener.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        this.B = new Handler();
        this.C = false;
        this.D = false;
        this.E = false;
        this.f34685x = mBridgeVideoView;
        this.f34686y = mBridgeContainerView;
        this.G = i10;
        this.f34687z = i11;
        this.F = i13;
        if (mBridgeVideoView != null) {
            this.C = mBridgeVideoView.getVideoSkipTime() == 0;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f34668a = false;
        }
    }

    private void n() {
        try {
            Timer timer = this.A;
            if (timer != null) {
                timer.cancel();
                this.A = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void o() {
        if (!this.D && this.F == 1) {
            j();
            h();
            i();
            if (s0.a().a("i_l_s_t_r_i", false) && !this.E) {
                this.E = true;
                MBridgeVideoView.u uVar = this.H;
                if (uVar != null) {
                    uVar.a();
                }
            }
        }
        if (this.f34669b.getAdSpaceT() != 2) {
            this.f34686y.showEndcard(this.f34669b.getVideo_end_type());
        } else {
            this.f34686y.showVideoEndCover();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    private void p() {
        CampaignEx campaignEx;
        CampaignEx campaignEx2 = this.f34669b;
        if (campaignEx2 == null || campaignEx2.getDynamicTempCode() != 5) {
            return;
        }
        MBridgeVideoView mBridgeVideoView = this.f34685x;
        if (mBridgeVideoView == null || mBridgeVideoView.mCampOrderViewData == null) {
            campaignEx = null;
        } else {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f34685x.mCampOrderViewData.size(); i11++) {
                if (this.f34685x.mCampOrderViewData.get(i11) != null && this.f34685x.mCampOrderViewData.get(i11).getId() == this.f34669b.getId()) {
                    i10 = i11 - 1;
                    break;
                }
            }
            if (i10 < 0 || this.f34685x.mCampOrderViewData.get(i10) == null) {
                campaignEx = null;
            } else {
                campaignEx = this.f34685x.mCampOrderViewData.get(i10);
            }
        }
        if (campaignEx != null) {
            MBridgeVideoView mBridgeVideoView2 = this.f34685x;
            if (mBridgeVideoView2 != null) {
                mBridgeVideoView2.setCampaign(campaignEx);
            }
            MBridgeContainerView mBridgeContainerView = this.f34686y;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setCampaign(campaignEx);
            }
            a(campaignEx);
        }
    }

    private void q() {
        try {
            n();
            this.A = new Timer();
            this.A.schedule(new a(), 3000L);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0210  */
    /* JADX WARN: Code duplicated, block: B:111:0x0228  */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:114:0x0237  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:161:0x0301  */
    /* JADX WARN: Code duplicated, block: B:167:0x031e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0321  */
    /* JADX WARN: Code duplicated, block: B:170:0x0328  */
    @Override // com.mbridge.msdk.video.module.listener.impl.o, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        CampaignEx campaignEx;
        CampaignEx campaignEx2;
        int bufferTimeout;
        String playURL;
        int i11;
        if (this.f34668a) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f34685x.dismissAllAlert();
                    this.f34685x.videoOperate(3);
                    campaignEx = this.f34669b;
                    if (campaignEx == null && campaignEx.isDynamicView() && this.f34669b.getDynamicTempCode() == 5) {
                        if (this.f34686y != null) {
                            MBridgeVideoView mBridgeVideoView = this.f34685x;
                            if (mBridgeVideoView.mCurrPlayNum == mBridgeVideoView.mCampaignSize) {
                                if (this.f34669b.getAdSpaceT() == 2) {
                                    i10 = 16;
                                } else {
                                    this.f34686y.setRewardStatus(true);
                                    this.f34686y.showOrderCampView();
                                }
                            }
                        }
                        com.mbridge.msdk.video.bt.module.orglistener.f.a(this.f34669b, this.f34674g, this.f34685x.mCurrentPlayProgressTime);
                        if (this.D) {
                            k();
                            if (this.F == 1) {
                                o();
                            }
                            i10 = 12;
                        } else if (this.G == 2) {
                            i10 = 16;
                        } else {
                            i10 = 16;
                        }
                    } else if (this.D) {
                        k();
                        if (this.F == 1) {
                            o();
                        }
                        i10 = 12;
                    } else if (this.G == 2 || this.f34686y.endCardShowing() || this.f34669b.getAdSpaceT() == 2) {
                        i10 = 16;
                    } else {
                        this.f34686y.showEndcard(this.f34669b.getVideo_end_type());
                    }
                } else if (i10 != 5) {
                    if (i10 == 6) {
                        this.f34685x.dismissAllAlert();
                        this.f34685x.videoOperate(3);
                        campaignEx = this.f34669b;
                        if (campaignEx == null) {
                            if (this.D) {
                                k();
                                if (this.F == 1) {
                                    o();
                                }
                                i10 = 12;
                            } else if (this.G == 2) {
                                i10 = 16;
                            } else {
                                i10 = 16;
                            }
                        } else if (this.D) {
                            k();
                            if (this.F == 1) {
                                o();
                            }
                            i10 = 12;
                        } else if (this.G == 2) {
                            i10 = 16;
                        } else {
                            i10 = 16;
                        }
                    } else if (i10 == 8) {
                        MBridgeContainerView mBridgeContainerView = this.f34686y;
                        if (mBridgeContainerView == null) {
                            MBridgeVideoView mBridgeVideoView2 = this.f34685x;
                            if (mBridgeVideoView2 != null) {
                                mBridgeVideoView2.showAlertView();
                            }
                        } else if (mBridgeContainerView.showAlertWebView()) {
                            MBridgeVideoView mBridgeVideoView3 = this.f34685x;
                            if (mBridgeVideoView3 != null) {
                                mBridgeVideoView3.alertWebViewShowed();
                            }
                        } else {
                            MBridgeVideoView mBridgeVideoView4 = this.f34685x;
                            if (mBridgeVideoView4 != null) {
                                mBridgeVideoView4.showAlertView();
                            }
                        }
                    } else if (i10 != 20) {
                        switch (i10) {
                            case 10:
                                this.D = true;
                                this.f34685x.soundOperate(0, 2);
                                this.f34685x.progressOperate(0, 2);
                                break;
                            case 11:
                                this.f34685x.videoOperate(3);
                                this.f34685x.dismissAllAlert();
                                CampaignEx campaignEx3 = this.f34669b;
                                if (campaignEx3 == null || campaignEx3.getVideo_end_type() == 3 || this.f34669b.getRewardTemplateMode() == null || this.f34669b.getRewardTemplateMode().k() == 5002010) {
                                    this.f34685x.setVisibility(0);
                                } else if (this.f34669b.getAdSpaceT() != 2) {
                                    this.f34685x.setVisibility(8);
                                }
                                CampaignEx campaignEx4 = this.f34669b;
                                if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5) {
                                    MBridgeVideoView mBridgeVideoView5 = this.f34685x;
                                    if (mBridgeVideoView5.mCurrPlayNum != mBridgeVideoView5.mCampaignSize) {
                                        campaignEx2 = this.f34669b;
                                        if (campaignEx2 == null) {
                                            if (this.f34669b.getAdSpaceT() != 2) {
                                                this.f34686y.showEndcard(this.f34669b.getVideo_end_type());
                                            } else {
                                                this.f34686y.showVideoEndCover();
                                            }
                                        } else if (this.f34669b.getAdSpaceT() != 2) {
                                            this.f34686y.showEndcard(this.f34669b.getVideo_end_type());
                                        } else {
                                            this.f34686y.showVideoEndCover();
                                        }
                                    } else {
                                        MBridgeContainerView mBridgeContainerView2 = this.f34686y;
                                        if (mBridgeContainerView2 != null) {
                                            mBridgeContainerView2.setRewardStatus(true);
                                            this.f34686y.showOrderCampView();
                                        }
                                    }
                                } else {
                                    campaignEx2 = this.f34669b;
                                    if (campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null || this.f34669b.getRewardTemplateMode().k() != 5002010) {
                                        if (this.f34669b.getAdSpaceT() != 2) {
                                            this.f34686y.showEndcard(this.f34669b.getVideo_end_type());
                                        } else {
                                            this.f34686y.showVideoEndCover();
                                        }
                                    }
                                }
                                break;
                            case 12:
                                k();
                                this.f34685x.videoOperate(3);
                                this.f34685x.dismissAllAlert();
                                if (this.f34669b.getVideo_end_type() != 3) {
                                    this.f34685x.setVisibility(8);
                                } else {
                                    this.f34685x.setVisibility(0);
                                }
                                if (this.D || this.F != 0) {
                                    if (this.f34669b.isDynamicView() && this.f34669b.getDynamicTempCode() == 5 && TextUtils.isEmpty(this.f34669b.getendcard_url())) {
                                        p();
                                        this.F = 0;
                                    }
                                    o();
                                }
                                break;
                            case 13:
                                MBridgeVideoView mBridgeVideoView6 = this.f34685x;
                                if (mBridgeVideoView6 != null) {
                                    mBridgeVideoView6.closeVideoOperate(0, 2);
                                    playURL = this.f34685x.getPlayURL();
                                    bufferTimeout = this.f34685x.getBufferTimeout();
                                } else {
                                    bufferTimeout = -1;
                                    playURL = "";
                                }
                                CampaignEx campaignEx5 = this.f34669b;
                                String videoUrlEncode = campaignEx5 != null ? campaignEx5.getVideoUrlEncode() : "";
                                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                                eVar.a("play_url", playURL);
                                eVar.a(CampaignEx.JSON_KEY_VIDEO_URL, videoUrlEncode);
                                eVar.a("timeout", Integer.valueOf(bufferTimeout));
                                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_video_buffer_timeout", this.f34669b, eVar);
                                break;
                            case 14:
                                if (!this.C) {
                                    this.f34685x.closeVideoOperate(0, 1);
                                }
                                break;
                            case 15:
                                if (obj != null && (obj instanceof MBridgeVideoView.v)) {
                                    MBridgeVideoView.v vVar = (MBridgeVideoView.v) obj;
                                    int videoInteractiveType = this.f34686y.getVideoInteractiveType();
                                    if (this.f34669b.getAdSpaceT() == 2) {
                                        SoundImageView soundImageView = this.f34685x.mSoundImageView;
                                        if (soundImageView != null && (soundImageView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34685x.mSoundImageView.getLayoutParams();
                                            layoutParams.setMargins(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f), 0, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 85.0f));
                                            this.f34685x.mSoundImageView.setLayoutParams(layoutParams);
                                        }
                                        TextView textView = this.f34685x.tvFlag;
                                        if (textView != null && (textView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f34685x.tvFlag.getLayoutParams();
                                            layoutParams2.setMargins(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f), 0, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 85.0f));
                                            this.f34685x.tvFlag.setVisibility(0);
                                            this.f34685x.tvFlag.setLayoutParams(layoutParams2);
                                        }
                                        this.f34686y.showVideoClickView(1);
                                    } else if (videoInteractiveType >= 0 && vVar.f34636a >= videoInteractiveType) {
                                        this.f34686y.showVideoClickView(1);
                                        this.f34685x.soundOperate(0, 1);
                                    }
                                    this.C = vVar.f34638c;
                                    if (this.f34669b.getDynamicTempCode() != 5) {
                                        int i12 = this.f34687z;
                                        if (((i12 >= 0 && ((i11 = vVar.f34636a) >= i12 || i11 == vVar.f34637b)) || (this.f34669b.getVideoCompleteTime() > 0 && (vVar.f34636a > this.f34669b.getVideoCompleteTime() || vVar.f34636a == vVar.f34637b))) && !this.C) {
                                            this.f34685x.closeVideoOperate(0, 2);
                                            this.C = true;
                                        }
                                    } else {
                                        a(vVar.f34636a, vVar.f34637b);
                                    }
                                }
                                break;
                        }
                    } else if (s0.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.u)) {
                        this.H = (MBridgeVideoView.u) obj;
                    }
                } else if (obj != null && (obj instanceof Integer)) {
                    this.f34685x.soundOperate((((Integer) obj).intValue() == 1 ? 2 : 1).intValue(), -1);
                }
            } else if (!this.f34686y.endCardShowing()) {
                int videoInteractiveType2 = this.f34686y.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.f34686y.isLast()) {
                            this.f34686y.showVideoClickView(1);
                            this.f34685x.soundOperate(0, 1);
                            q();
                        } else {
                            this.f34686y.showVideoClickView(-1);
                            this.f34685x.soundOperate(0, 2);
                            n();
                        }
                    }
                } else if (this.f34686y.miniCardLoaded()) {
                    this.f34686y.showVideoClickView(2);
                }
            }
        }
        super.a(i10, obj);
    }

    private void a(int i10, int i11) {
        CampaignEx campaignEx;
        if (this.C || this.f34685x == null || (campaignEx = this.f34669b) == null) {
            return;
        }
        int i12 = this.f34687z;
        int i13 = (i12 < 0 || i10 < i12) ? 1 : 2;
        if (i13 != 2 && (campaignEx.getVideoCompleteTime() != 0 ? i10 > this.f34669b.getVideoCompleteTime() : this.f34685x.mCurrPlayNum > 1)) {
            i13 = 2;
        }
        if (i13 != 2 && this.f34685x.mCurrPlayNum > 1 && i10 == i11) {
            i13 = 2;
        }
        if (i13 == 2) {
            this.f34685x.closeVideoOperate(0, i13);
            this.C = true;
        }
    }
}
