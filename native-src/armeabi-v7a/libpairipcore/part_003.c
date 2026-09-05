// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 41-60
// ============================================================

// ============================================================
// Function #41
// Name: FUN_0001a73c
// Address: 0001a73c
// JNI: NO
// ============================================================


void FUN_0001a73c(char *param_1,int param_2)

{
  int iVar1;
  
  iVar1 = FUN_00026070(param_2,10000);
  *param_1 = (char)iVar1 + '0';
  FUN_0001a700(param_1 + 1,param_2 + iVar1 * -10000);
  return;
}




// ============================================================
// Function #42
// Name: FUN_0001a7ac
// Address: 0001a7ac
// JNI: NO
// ============================================================


void FUN_0001a7ac(char *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  
  iVar1 = DAT_0001a7dc;
  iVar2 = FUN_00026070(param_2,DAT_0001a7dc);
  param_2 = param_2 - iVar2 * iVar1;
  *param_1 = (char)iVar2 + '0';
  iVar1 = FUN_00026070(param_2,10000);
  *(undefined2 *)(param_1 + 1) = *(undefined2 *)(DAT_0001a7a8 + 0x1a794 + iVar1 * 2);
  FUN_0001a700(param_1 + 3,param_2 + iVar1 * -10000);
  return;
}




// ============================================================
// Function #43
// Name: FUN_0001a81c
// Address: 0001a81c
// JNI: NO
// ============================================================


void FUN_0001a81c(char *param_1,int param_2)

{
  int iVar1;
  int iVar2;
  undefined4 extraout_r3;
  undefined4 unaff_r4;
  undefined4 unaff_r5;
  undefined4 unaff_r6;
  undefined4 unaff_r7;
  undefined4 unaff_r11;
  undefined4 unaff_lr;
  
  iVar2 = DAT_0001a84c;
  iVar1 = FUN_00026070(param_2,DAT_0001a84c);
  param_2 = param_2 - iVar1 * iVar2;
  *param_1 = (char)iVar1 + '0';
  iVar2 = DAT_0001a814;
  iVar1 = FUN_00026070(param_2,DAT_0001a814);
  param_2 = param_2 - iVar1 * iVar2;
  iVar2 = DAT_0001a818 + 0x1a800;
  *(undefined2 *)(param_1 + 1) = *(undefined2 *)(iVar2 + iVar1 * 2);
  iVar2 = FUN_00026070(param_2,10000,iVar2,extraout_r3,unaff_r11,unaff_r4,unaff_r5,unaff_r6,unaff_r7
                       ,unaff_lr);
  *(undefined2 *)(param_1 + 3) = *(undefined2 *)(DAT_0001a7a8 + 0x1a794 + iVar2 * 2);
  FUN_0001a700(param_1 + 5,param_2 + iVar2 * -10000);
  return;
}




// ============================================================
// Function #44
// Name: FUN_0001a88c
// Address: 0001a88c
// JNI: NO
// ============================================================


void FUN_0001a88c(int *param_1,int param_2,int param_3)

{
  uint uVar1;
  char *pcVar2;
  
  uVar1 = param_3 - param_2;
  if (uVar1 < 0xfffffff8) {
    if (uVar1 < 0xb) {
      pcVar2 = (char *)((int)param_1 + 1);
      *(char *)param_1 = (char)uVar1 * '\x02';
    }
    else {
      pcVar2 = (char *)FUN_000a0370((uVar1 | 7) + 1);
      *param_1 = (uVar1 | 7) + 2;
      param_1[1] = uVar1;
      param_1[2] = (int)pcVar2;
    }
    param_3 = param_3 - param_2;
    if (param_3 != 0) {
      __aeabi_memmove(pcVar2,param_2,param_3);
    }
    pcVar2[param_3] = '\0';
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00019fd0();
}




// ============================================================
// Function #45
// Name: FUN_0001a8ee
// Address: 0001a8ee
// JNI: NO
// ============================================================


undefined8 FUN_0001a8ee(void)

{
  undefined4 in_stack_00000000;
  undefined4 in_stack_00000004;
  
  FUN_0001a900();
  return CONCAT44(in_stack_00000004,in_stack_00000000);
}




// ============================================================
// Function #46
// Name: FUN_0001a900
// Address: 0001a900
// JNI: NO
// ============================================================


void FUN_0001a900(undefined4 *param_1,undefined1 *param_2,undefined1 *param_3,undefined4 param_4,
                 int param_5,uint param_6)

{
  undefined4 uVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  bool bVar4;
  undefined8 uVar5;
  
  puVar2 = param_2;
  if ((0x7fffffff < param_6) && (param_2 != param_3)) {
    bVar4 = param_5 != 0;
    param_5 = -param_5;
    param_6 = -(uint)bVar4 - param_6;
    puVar2 = param_2 + 1;
    *param_2 = 0x2d;
  }
  puVar3 = puVar2;
  if (((int)param_3 - (int)puVar2 < 0x14) &&
     (uVar5 = FUN_0001a96c(param_5,param_6), puVar3 = (undefined1 *)((ulonglong)uVar5 >> 0x20),
     (int)param_3 - (int)puVar2 < (int)uVar5)) {
    uVar1 = 0x4b;
  }
  else {
    param_3 = (undefined1 *)FUN_0001a9bc(puVar2,puVar3,param_5,param_6);
    uVar1 = 0;
  }
  *param_1 = param_3;
  param_1[1] = uVar1;
  return;
}




// ============================================================
// Function #47
// Name: FUN_0001a96c
// Address: 0001a96c
// JNI: NO
// ============================================================


int FUN_0001a96c(uint param_1,uint param_2)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  
  iVar1 = LZCOUNT(param_1 | 1) + 0x20;
  if (param_2 != 0) {
    iVar1 = LZCOUNT(param_2);
  }
  uVar2 = (0x40 - iVar1) * 0x4d1;
  uVar3 = uVar2 >> 0xc;
  uVar4 = *(uint *)(DAT_0001a9b8 + 0x1a99a + uVar3 * 8 + 4);
  if (param_2 <= uVar4 &&
      (uint)(*(uint *)(DAT_0001a9b8 + 0x1a99a + uVar3 * 8) <= param_1) <= param_2 - uVar4) {
    uVar3 = (uVar2 >> 0xc) - 1;
  }
  return uVar3 + 1;
}




// ============================================================
// Function #48
// Name: FUN_0001a9bc
// Address: 0001a9bc
// JNI: NO
// ============================================================


void FUN_0001a9bc(undefined2 *param_1,undefined4 param_2,uint param_3,uint param_4)

{
  longlong lVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  undefined4 unaff_r4;
  undefined4 unaff_r5;
  undefined4 unaff_r6;
  undefined4 unaff_r7;
  undefined4 unaff_r11;
  uint uVar6;
  undefined4 unaff_lr;
  bool bVar7;
  ulonglong uVar8;
  
  uVar2 = DAT_0001aa2c;
  if (param_4 == 0) {
    FUN_0001a5f0(param_1,param_3);
    return;
  }
  if (1 < param_4 && (uint)(param_3 <= DAT_0001aa2c) <= 2 - param_4) {
    uVar8 = FUN_00026034(param_3,param_4,DAT_0001aa30,2);
    lVar1 = (uVar8 & 0xffffffff) * (ulonglong)(uVar2 + 1);
    uVar6 = (uint)lVar1;
    bVar7 = param_3 < uVar6;
    param_3 = param_3 - uVar6;
    param_4 = (param_4 -
              ((int)(uVar8 >> 0x20) * (uVar2 + 1) + (int)uVar8 * 2 + (int)((ulonglong)lVar1 >> 0x20)
              )) - (uint)bVar7;
    param_1 = (undefined2 *)FUN_0001a5f0(param_1,(int)uVar8);
  }
  iVar3 = DAT_0001aa6c;
  iVar4 = FUN_00026034(param_3,param_4,DAT_0001aa6c,0,unaff_r11,unaff_r4,unaff_r5,unaff_r6,unaff_r7,
                       unaff_lr);
  iVar5 = param_3 - iVar4 * iVar3;
  *param_1 = *(undefined2 *)(DAT_0001aa70 + 0x1aa58 + iVar4 * 2);
  iVar3 = DAT_0001a814;
  iVar4 = FUN_00026070(iVar5,DAT_0001a814);
  iVar5 = iVar5 - iVar4 * iVar3;
  param_1[1] = *(undefined2 *)(DAT_0001a818 + 0x1a800 + iVar4 * 2);
  iVar3 = FUN_00026070(iVar5,10000);
  param_1[2] = *(undefined2 *)(DAT_0001a7a8 + 0x1a794 + iVar3 * 2);
  FUN_0001a700(param_1 + 3,iVar5 + iVar3 * -10000);
  return;
}




// ============================================================
// Function #49
// Name: FUN_0001aa74
// Address: 0001aa74
// JNI: NO
// ============================================================


void FUN_0001aa74(undefined4 param_1,undefined4 param_2,int param_3)

{
  undefined4 *puVar1;
  char *pcVar2;
  char *pcVar3;
  undefined4 uVar4;
  char acStack_420 [1024];
  
  pcVar3 = acStack_420;
  puVar1 = (undefined4 *)__errno();
  uVar4 = *puVar1;
  pcVar2 = strerror_r(param_3,acStack_420,0x400);
  if (pcVar2 != (char *)0x0) {
    if (pcVar2 == (char *)0xffffffff) {
      pcVar2 = (char *)*puVar1;
    }
    if (pcVar2 != (char *)0x16) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    pcVar3 = (char *)(DAT_0001aadc + 0x1aaae);
  }
  if (*pcVar3 == '\0') {
    snprintf(acStack_420,0x400,(char *)(DAT_0001aae0 + 0x1aabe),param_3);
    pcVar3 = acStack_420;
  }
  *puVar1 = uVar4;
  FUN_0001a540(param_1,pcVar3);
  return;
}




// ============================================================
// Function #50
// Name: FUN_0001aae4
// Address: 0001aae4
// JNI: NO
// ============================================================


undefined * FUN_0001aae4(void)

{
  return &UNK_0001aaee + DAT_0001aaf0;
}




// ============================================================
// Function #51
// Name: FUN_0001ab10
// Address: 0001ab10
// JNI: NO
// ============================================================


undefined * FUN_0001ab10(void)

{
  return &UNK_0001ab1a + DAT_0001ab1c;
}




// ============================================================
// Function #52
// Name: FUN_0001ab3c
// Address: 0001ab3c
// JNI: NO
// ============================================================


void FUN_0001ab3c(int *param_1,undefined4 param_2,int param_3)

{
  int iVar1;
  
  iVar1 = DAT_0001ab54 + 0x1ab4a;
  if (0xfff < param_3) {
    iVar1 = DAT_0001ab54 + 0x1ab4e;
  }
  *param_1 = param_3;
  param_1[1] = iVar1;
  return;
}




// ============================================================
// Function #53
// Name: FUN_0001ab58
// Address: 0001ab58
// JNI: NO
// ============================================================


void FUN_0001ab58(undefined8 *param_1,int *param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined1 auStack_24 [12];
  
  if (*param_2 != 0) {
    iVar1 = FUN_0001acc8(param_3);
    if (iVar1 == 0) {
      FUN_0001a414(param_3,DAT_0001abc0 + 0x1ab7c);
    }
    (**(code **)(*(int *)param_2[1] + 0x18))(auStack_24,(int *)param_2[1],*param_2);
    FUN_0001acde(param_3,auStack_24);
    FUN_00019fe0(auStack_24);
  }
  uVar2 = *param_3;
  *(undefined4 *)param_3 = 0;
  *(undefined4 *)((int)param_3 + 4) = 0;
  *(undefined4 *)(param_1 + 1) = *(undefined4 *)(param_3 + 1);
  *param_1 = uVar2;
  *(undefined4 *)(param_3 + 1) = 0;
  return;
}




// ============================================================
// Function #54
// Name: FUN_0001abc4
// Address: 0001abc4
// JNI: NO
// ============================================================


int * FUN_0001abc4(int *param_1,int param_2,int param_3,undefined4 param_4)

{
  undefined1 auStack_30 [12];
  undefined1 auStack_24 [12];
  int local_18;
  int iStack_14;
  
  local_18 = param_2;
  iStack_14 = param_3;
  FUN_0001a540(auStack_30,param_4);
  FUN_0001ab58(auStack_24,&local_18,auStack_30);
  FUN_00019ea0(param_1,auStack_24);
  FUN_00019fe0(auStack_24);
  FUN_00019fe0(auStack_30);
  param_1[2] = local_18;
  param_1[3] = iStack_14;
  *param_1 = *(int *)(DAT_0001ac24 + 0x1ac06) + 8;
  return param_1;
}




// ============================================================
// Function #55
// Name: FUN_0001ac28
// Address: 0001ac28
// JNI: NO
// ============================================================


void FUN_0001ac28(void)

{
  FUN_0001b4f4();
  return;
}




// ============================================================
// Function #56
// Name: FUN_0001ac34
// Address: 0001ac34
// JNI: NO
// ============================================================


void FUN_0001ac34(undefined4 param_1)

{
  FUN_0001ac28();
  FUN_00023f68(param_1,0x10);
  return;
}




// ============================================================
// Function #57
// Name: FUN_0001ac4c
// Address: 0001ac4c
// JNI: NO
// ============================================================


/* WARNING: Control flow encountered bad instruction data */

void FUN_0001ac4c(undefined4 param_1,undefined4 param_2)

{
  FUN_0001ac60(param_1,DAT_0001ac5c + 0x1ac58,param_2);
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}




// ============================================================
// Function #58
// Name: FUN_0001ac60
// Address: 0001ac60
// JNI: NO
// ============================================================


void FUN_0001ac60(undefined4 param_1,undefined4 param_2,undefined4 param_3)

{
  undefined4 uVar1;
  
  uVar1 = FUN_00023fdc(0x10);
  FUN_0001abc4(uVar1,param_1,param_2,param_3);
  FUN_000240ec(uVar1,*(undefined4 *)(DAT_0001ac9c + 0x1ac86),*(undefined4 *)(DAT_0001aca0 + 0x1ac8c)
              );
  FUN_00024072(uVar1);
                    /* WARNING: Subroutine does not return */
  FUN_00023f96();
}




// ============================================================
// Function #59
// Name: FUN_0001aca4
// Address: 0001aca4
// JNI: NO
// ============================================================


void FUN_0001aca4(void)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001acfa();
  FUN_00023f68(uVar1,4);
  return;
}




// ============================================================
// Function #60
// Name: FUN_0001acb6
// Address: 0001acb6
// JNI: NO
// ============================================================


void FUN_0001acb6(void)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001acfa();
  FUN_00023f68(uVar1,4);
  return;
}




