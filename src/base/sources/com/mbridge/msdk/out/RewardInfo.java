package com.mbridge.msdk.out;

import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class RewardInfo implements Serializable, NoProGuard {
    private boolean isCompleteView;
    private int rewardAlertStatus;
    private String rewardAmount;
    private String rewardName;

    public RewardInfo(boolean z10, int i10) {
        this.isCompleteView = z10;
        this.rewardAlertStatus = i10;
    }

    public int getRewardAlertStatus() {
        return this.rewardAlertStatus;
    }

    public String getRewardAmount() {
        return this.rewardAmount;
    }

    public String getRewardName() {
        return this.rewardName;
    }

    public boolean isCompleteView() {
        return this.isCompleteView;
    }

    public void setCompleteView(boolean z10) {
        this.isCompleteView = z10;
    }

    public void setRewardAlertStatus(int i10) {
        this.rewardAlertStatus = i10;
    }

    public void setRewardAmount(String str) {
        this.rewardAmount = str;
    }

    public void setRewardName(String str) {
        this.rewardName = str;
    }

    public String toString() {
        return "RewardInfo{isCompleteView=" + this.isCompleteView + ", rewardName='" + this.rewardName + "', rewardAmount='" + this.rewardAmount + "', rewardAlertStatus=" + this.rewardAlertStatus + '}';
    }

    public RewardInfo(boolean z10, String str, String str2) {
        this.isCompleteView = z10;
        this.rewardName = str;
        this.rewardAmount = str2;
    }

    public RewardInfo(boolean z10, String str, String str2, int i10) {
        this.isCompleteView = z10;
        this.rewardName = str;
        this.rewardAmount = str2;
        this.rewardAlertStatus = i10;
    }
}
