// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 121-140
// ============================================================

// ============================================================
// Function #121
// Name: FUN_0001b5f0
// Address: 0001b5f0
// JNI: NO
// ============================================================


void FUN_0001b5f0(void)

{
  FUN_0001bb04();
  return;
}




// ============================================================
// Function #122
// Name: FUN_0001b608
// Address: 0001b608
// JNI: NO
// ============================================================


void FUN_0001b608(void)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001bb04();
  FUN_00023f68(uVar1,8);
  return;
}




// ============================================================
// Function #123
// Name: FUN_0001b61a
// Address: 0001b61a
// JNI: NO
// ============================================================


void FUN_0001b61a(void)

{
  undefined4 uVar1;
  
  uVar1 = FUN_0001bb04();
  FUN_00023f68(uVar1,0xc);
  return;
}




// ============================================================
// Function #124
// Name: FUN_0001b62c
// Address: 0001b62c
// JNI: NO
// ============================================================


bool FUN_0001b62c(int param_1,int param_2,int param_3)

{
  int iVar1;
  
  if (param_3 == 0) {
    return *(int *)(param_1 + 4) == *(int *)(param_2 + 4);
  }
  if (param_1 != param_2) {
    iVar1 = strcmp(*(char **)(param_1 + 4),*(char **)(param_2 + 4));
    return iVar1 == 0;
  }
  return true;
}




// ============================================================
// Function #125
// Name: FUN_0001b636
// Address: 0001b636
// JNI: NO
// ============================================================


bool FUN_0001b636(int param_1,int param_2)

{
  int iVar1;
  
  iVar1 = strcmp(*(char **)(param_1 + 4),*(char **)(param_2 + 4));
  return iVar1 == 0;
}




// ============================================================
// Function #126
// Name: FUN_0001b658
// Address: 0001b658
// JNI: NO
// ============================================================


bool FUN_0001b658(int param_1,int param_2,int *param_3)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  bool bVar4;
  
  if (*(int *)(param_1 + 4) == *(int *)(param_2 + 4)) {
    bVar4 = true;
  }
  else {
    bVar4 = false;
    piVar3 = (int *)FUN_0001b708(param_2,*(undefined4 *)(DAT_0001b6f4 + 0x1b676),
                                 *(undefined4 *)(DAT_0001b6f8 + 0x1b67c),0);
    if (piVar3 != (int *)0x0) {
      if (*param_3 == 0) {
                    /* WARNING: Subroutine does not return */
        FUN_0001b568(DAT_0001b6fc + 0x1b6ec,DAT_0001b700 + 0x1b6ee,0x1e7,DAT_0001b704 + 0x1b6f0);
      }
      iVar1 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
      iVar2 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
      (**(code **)(*piVar3 + 0x1c))();
      bVar4 = iVar1 == 1;
      if (iVar1 == 1) {
        *param_3 = iVar2;
      }
    }
  }
  return bVar4;
}




// ============================================================
// Function #127
// Name: FUN_0001b708
// Address: 0001b708
// JNI: NO
// ============================================================


int FUN_0001b708(int *param_1,undefined4 param_2,int *param_3,int param_4)

{
  int iVar1;
  int *piVar2;
  int iVar3;
  bool bVar4;
  int *local_60;
  int *local_5c;
  int *local_58;
  int local_54;
  int local_50;
  int iStack_4c;
  int local_48;
  int local_44;
  int local_40;
  int iStack_3c;
  int local_38;
  int iStack_34;
  undefined4 local_30;
  undefined4 local_2c;
  undefined4 local_28;
  
  iVar1 = *(int *)(*param_1 + -8);
  piVar2 = *(int **)(*param_1 + -4);
  iVar3 = (int)param_1 + iVar1;
  local_54 = param_4;
  if (piVar2[1] == param_3[1]) {
    if (param_4 < 0) {
      local_50 = 0;
      if (param_4 != -2) {
        iStack_4c = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
        local_48 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
        local_44 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
        local_2c = 0x1000000;
        local_50 = 0;
        local_40 = 0;
        local_28 = 0;
        local_30 = 1;
        local_60 = param_3;
        local_5c = param_1;
        local_58 = (int *)param_2;
        iStack_3c = iStack_4c;
        local_38 = local_48;
        iStack_34 = local_44;
        (**(code **)(*param_3 + 0x14))(param_3,&local_60,iVar3,iVar3,1,0);
        local_50 = 0;
        if (local_48 == 1) {
          local_50 = iVar3;
        }
      }
    }
    else {
      local_50 = iVar3;
      if (iVar1 + param_4 != 0) {
        local_50 = 0;
      }
    }
  }
  else {
    if ((-1 < param_4) && (iVar1 = (int)param_1 - param_4, iVar3 <= iVar1)) {
      iStack_4c = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
      local_48 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
      local_44 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
      local_2c = 0x1000000;
      local_50 = 0;
      local_28 = 0;
      local_40 = 0;
      local_30 = 1;
      local_60 = piVar2;
      local_5c = (int *)iVar1;
      local_58 = param_3;
      iStack_3c = iStack_4c;
      local_38 = local_48;
      iStack_34 = local_44;
      (**(code **)(*piVar2 + 0x14))(piVar2,&local_60,iVar3,iVar3,1,0);
      if (local_48 != 0) {
        return iVar1;
      }
    }
    iStack_4c = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
    local_48 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
    local_44 = *(int *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
    local_50 = 0;
    local_30 = 0;
    local_2c = 0x1000000;
    local_28 = 0;
    local_40 = 0;
    local_60 = param_3;
    local_5c = param_1;
    local_58 = (int *)param_2;
    local_54 = param_4;
    iStack_3c = iStack_4c;
    local_38 = local_48;
    iStack_34 = local_44;
    (**(code **)(*piVar2 + 0x18))(piVar2,&local_60,iVar3,1,0);
    if (iStack_3c == 1) {
      if (local_48 != 1) {
        if (local_38 != 0) {
          return 0;
        }
        bVar4 = local_44 != 1;
        if (!bVar4) {
          local_44 = local_40;
        }
        if (bVar4 || local_44 != 1) {
          return 0;
        }
      }
    }
    else {
      local_50 = 0;
      if (iStack_3c == 0) {
        local_50 = iStack_4c;
        if (local_40 != 1) {
          local_50 = 0;
        }
        if (local_44 != 1 || local_38 != 1) {
          local_50 = 0;
        }
      }
    }
  }
  return local_50;
}




// ============================================================
// Function #128
// Name: FUN_0001b8a8
// Address: 0001b8a8
// JNI: NO
// ============================================================


void FUN_0001b8a8(int param_1,int param_2,int param_3,undefined4 param_4)

{
  int iVar1;
  bool bVar2;
  
  if (*(int *)(param_1 + 4) != *(int *)(*(int *)(param_2 + 8) + 4)) {
    return;
  }
  if (*(int *)(param_2 + 0x24) == 0) {
    *(undefined4 *)(param_2 + 0x18) = param_4;
    *(undefined4 *)(param_2 + 0x24) = 1;
    *(int *)(param_2 + 0x10) = param_3;
    *(undefined4 *)(param_2 + 0x14) = *(undefined4 *)(param_2 + 0x38);
    return;
  }
  iVar1 = *(int *)(param_2 + 0x14);
  bVar2 = iVar1 == *(int *)(param_2 + 0x38);
  if (bVar2) {
    iVar1 = *(int *)(param_2 + 0x10);
  }
  if (bVar2 && iVar1 == param_3) {
    if (*(int *)(param_2 + 0x18) == 2) {
      *(undefined4 *)(param_2 + 0x18) = param_4;
    }
    return;
  }
  *(undefined1 *)(param_2 + 0x36) = 1;
  *(undefined4 *)(param_2 + 0x18) = 2;
  *(int *)(param_2 + 0x24) = *(int *)(param_2 + 0x24) + 1;
  return;
}




// ============================================================
// Function #129
// Name: FUN_0001b8c0
// Address: 0001b8c0
// JNI: NO
// ============================================================


void FUN_0001b8c0(int param_1,int param_2,int param_3,undefined4 param_4)

{
  int iVar1;
  bool bVar2;
  
  if (*(int *)(param_1 + 4) != *(int *)(*(int *)(param_2 + 8) + 4)) {
                    /* WARNING: Could not recover jumptable at 0x0001b8da. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(**(int **)(param_1 + 8) + 0x1c))();
    return;
  }
  if (*(int *)(param_2 + 0x24) == 0) {
    *(undefined4 *)(param_2 + 0x18) = param_4;
    *(undefined4 *)(param_2 + 0x24) = 1;
    *(int *)(param_2 + 0x10) = param_3;
    *(undefined4 *)(param_2 + 0x14) = *(undefined4 *)(param_2 + 0x38);
    return;
  }
  iVar1 = *(int *)(param_2 + 0x14);
  bVar2 = iVar1 == *(int *)(param_2 + 0x38);
  if (bVar2) {
    iVar1 = *(int *)(param_2 + 0x10);
  }
  if (bVar2 && iVar1 == param_3) {
    if (*(int *)(param_2 + 0x18) == 2) {
      *(undefined4 *)(param_2 + 0x18) = param_4;
    }
    return;
  }
  *(undefined1 *)(param_2 + 0x36) = 1;
  *(undefined4 *)(param_2 + 0x18) = 2;
  *(int *)(param_2 + 0x24) = *(int *)(param_2 + 0x24) + 1;
  return;
}




// ============================================================
// Function #130
// Name: FUN_0001b93c
// Address: 0001b93c
// JNI: NO
// ============================================================


void FUN_0001b93c(int param_1,undefined4 *param_2,int param_3,int param_4,undefined4 param_5)

{
  int iVar1;
  undefined4 uVar2;
  bool bVar3;
  
  iVar1 = FUN_0001b62c(param_1,param_2[2],param_5);
  if (iVar1 == 0) {
    iVar1 = FUN_0001b62c(param_1,*param_2,param_5);
    if (iVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x0001b9a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(**(int **)(param_1 + 8) + 0x18))(*(int **)(param_1 + 8),param_2,param_3,param_4);
      return;
    }
    iVar1 = param_2[4];
    bVar3 = param_3 != iVar1;
    if (bVar3) {
      iVar1 = param_2[5];
    }
    if (bVar3 && param_3 != iVar1) {
      param_2[8] = param_4;
      if (param_2[0xb] != 4) {
        *(undefined2 *)(param_2 + 0xd) = 0;
        (**(code **)(**(int **)(param_1 + 8) + 0x14))
                  (*(int **)(param_1 + 8),param_2,param_3,param_3,1,param_5);
        if (*(char *)((int)param_2 + 0x35) == '\x01') {
          uVar2 = 3;
          if (*(char *)(param_2 + 0xd) == '\x01') {
            param_2[0xb] = 3;
            return;
          }
        }
        else {
          uVar2 = 4;
        }
        param_2[0xb] = uVar2;
      }
      param_2[5] = param_3;
      param_2[10] = param_2[10] + 1;
      if ((param_2[9] == 1) && (param_2[6] == 2)) {
        *(undefined1 *)((int)param_2 + 0x36) = 1;
      }
    }
    else if (param_4 == 1) {
      param_2[8] = 1;
    }
  }
  else if ((param_3 == param_2[1]) && (param_2[7] != 1)) {
    param_2[7] = param_4;
  }
  return;
}




// ============================================================
// Function #131
// Name: FUN_0001ba82
// Address: 0001ba82
// JNI: NO
// ============================================================


void FUN_0001ba82(int param_1,int param_2,int param_3,int param_4,int param_5,undefined4 param_6)

{
  int iVar1;
  
  iVar1 = FUN_0001b62c(param_1,*(undefined4 *)(param_2 + 8),param_6);
  if (iVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x0001bace. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(**(int **)(param_1 + 8) + 0x14))(*(int **)(param_1 + 8),param_2,param_3,param_4);
    return;
  }
  *(undefined1 *)(param_2 + 0x35) = 1;
  if (param_4 == *(int *)(param_2 + 4)) {
    *(undefined1 *)(param_2 + 0x34) = 1;
    if (*(int *)(param_2 + 0x10) == 0) {
      *(int *)(param_2 + 0x18) = param_5;
      *(undefined4 *)(param_2 + 0x24) = 1;
      *(int *)(param_2 + 0x10) = param_3;
      if (param_5 != 1) {
        return;
      }
      iVar1 = *(int *)(param_2 + 0x30);
    }
    else {
      if (*(int *)(param_2 + 0x10) != param_3) {
        *(int *)(param_2 + 0x24) = *(int *)(param_2 + 0x24) + 1;
        goto LAB_0001b934;
      }
      iVar1 = *(int *)(param_2 + 0x18);
      if (*(int *)(param_2 + 0x18) == 2) {
        *(int *)(param_2 + 0x18) = param_5;
        iVar1 = param_5;
      }
      if (*(int *)(param_2 + 0x30) != 1) {
        return;
      }
    }
    if (iVar1 == 1) {
LAB_0001b934:
      *(undefined1 *)(param_2 + 0x36) = 1;
      return;
    }
  }
  return;
}




// ============================================================
// Function #132
// Name: FUN_0001bb04
// Address: 0001bb04
// JNI: NO
// ============================================================


void FUN_0001bb04(void)

{
  return;
}




// ============================================================
// Function #133
// Name: FUN_0001bb0c
// Address: 0001bb0c
// JNI: NO
// ============================================================


int FUN_0001bb0c(char *param_1,int param_2,int *param_3,undefined4 *param_4)

{
  bool bVar1;
  char *pcVar2;
  size_t sVar3;
  int iVar4;
  int *piVar5;
  int *piVar6;
  undefined4 uVar7;
  int local_11e8;
  int local_11e4;
  int local_11e0;
  undefined4 uStack_11dc;
  undefined4 local_11d8;
  undefined4 local_11d4;
  char *local_11d0;
  char *local_11cc;
  undefined1 *local_11c8;
  undefined1 *puStack_11c4;
  undefined1 **local_11c0;
  undefined1 auStack_11bc [128];
  undefined1 *local_113c;
  undefined1 *puStack_1138;
  undefined4 **local_1134;
  undefined1 auStack_1130 [128];
  undefined4 *local_10b0;
  undefined4 *puStack_10ac;
  undefined4 **local_10a8;
  undefined4 local_10a4;
  undefined4 uStack_10a0;
  undefined4 uStack_109c;
  undefined4 uStack_1098;
  undefined4 local_1094;
  undefined4 uStack_1090;
  undefined4 uStack_108c;
  undefined4 uStack_1088;
  undefined4 *local_1084;
  undefined4 *local_1080;
  undefined4 **ppuStack_107c;
  undefined4 local_1078;
  undefined4 uStack_1074;
  undefined4 uStack_1070;
  undefined4 uStack_106c;
  undefined4 *local_1068;
  undefined4 *local_1064;
  undefined2 *puStack_1060;
  undefined4 local_105c;
  undefined4 uStack_1058;
  undefined4 uStack_1054;
  undefined4 uStack_1050;
  undefined2 local_104c;
  undefined1 local_104a;
  undefined4 local_1048;
  undefined4 local_1044;
  undefined4 uStack_1040;
  undefined4 uStack_103c;
  undefined4 uStack_1038;
  undefined4 local_1034;
  undefined4 *puStack_38;
  int aiStack_2c [2];
  
  if ((param_1 == (char *)0x0) || ((param_2 != 0 && (param_3 == (int *)0x0)))) {
    if (param_4 != (undefined4 *)0x0) {
      *param_4 = 0xfffffffd;
    }
    return 0;
  }
  sVar3 = strlen(param_1);
  local_11cc = param_1 + sVar3;
  local_11c0 = &local_113c;
  local_11c8 = auStack_11bc;
  local_11d0 = param_1;
  puStack_11c4 = local_11c8;
  __aeabi_memclr4(local_11c8,0x80);
  local_1134 = &local_10b0;
  local_113c = auStack_1130;
  puStack_1138 = local_113c;
  __aeabi_memclr8(local_113c,0x80);
  local_1068 = &local_105c;
  uStack_10a0 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x4);
  uStack_109c = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0x8);
  uStack_1098 = *(undefined4 *)((undefined1  [16])0x0 + (undefined1  [16])0xc);
  local_10b0 = &local_10a4;
  local_105c = 0;
  puStack_1060 = &local_104c;
  local_1044 = 0;
  local_104c = 1;
  local_1084 = &local_1078;
  local_1034 = 0;
  local_10a4 = 0;
  local_1078 = 0;
  ppuStack_107c = &local_1068;
  local_1094 = 0;
  local_10a8 = &local_1084;
  local_1048 = 0xffffffff;
  local_104a = 0;
  puStack_10ac = local_10b0;
  uStack_1090 = uStack_10a0;
  uStack_108c = uStack_109c;
  uStack_1088 = uStack_1098;
  local_1080 = local_1084;
  uStack_1074 = uStack_10a0;
  uStack_1070 = uStack_109c;
  uStack_106c = uStack_1098;
  local_1064 = local_1068;
  uStack_1058 = uStack_10a0;
  uStack_1054 = uStack_109c;
  uStack_1050 = uStack_1098;
  uStack_1040 = uStack_10a0;
  uStack_103c = uStack_109c;
  uStack_1038 = uStack_1098;
  puStack_38 = &uStack_1038;
  iVar4 = FUN_0001bec0(&local_11d0,DAT_0001bd74 + 0x1bbe2,2);
  if ((iVar4 == 0) && (iVar4 = FUN_0001bec0(&local_11d0,DAT_0001bd78 + 0x1bbf0,3), iVar4 == 0)) {
    iVar4 = FUN_0001bec0(&local_11d0,DAT_0001bd80 + 0x1bc4e,4);
    if ((iVar4 == 0) && (iVar4 = FUN_0001bec0(&local_11d0,DAT_0001bd84 + 0x1bc5c,5), iVar4 == 0)) {
      piVar5 = (int *)FUN_0001c660(&local_11d0);
      if (local_11cc != local_11d0) goto LAB_0001bcf4;
    }
    else {
      aiStack_2c[0] = FUN_0001bef4(&local_11d0);
      if ((aiStack_2c[0] == 0) ||
         (iVar4 = FUN_0001bec0(&local_11d0,DAT_0001bd88 + 0x1bc78,0xd), iVar4 == 0)) {
        piVar5 = (int *)0x0;
      }
      else {
        if ((local_11d0 == local_11cc) || (*local_11d0 != '_')) {
          bVar1 = false;
        }
        else {
          bVar1 = true;
          local_11d0 = local_11d0 + 1;
        }
        piVar5 = (int *)0x0;
        FUN_0001c5c0(&local_11e8,&local_11d0,0);
        if ((!bVar1) || (local_11e4 != 0)) {
          if (local_11cc != local_11d0) {
            if (*local_11d0 != '.') goto LAB_0001bc98;
            local_11d0 = local_11cc;
          }
          piVar5 = (int *)FUN_0001c610(&local_11d0,DAT_0001bd8c + 0x1bd4a,aiStack_2c);
        }
      }
    }
LAB_0001bc98:
    if (piVar5 != (int *)0x0) goto LAB_0001bc9a;
  }
  else {
    piVar5 = (int *)FUN_0001bef4(&local_11d0);
    pcVar2 = local_11d0;
    if (piVar5 != (int *)0x0) {
      iVar4 = (int)local_11cc - (int)local_11d0;
      if (iVar4 != 0) {
        if (*local_11d0 != '.') goto LAB_0001bcf4;
        piVar6 = (int *)FUN_0001dbc0(&uStack_1038,0x14);
        piVar6[2] = (int)piVar5;
        piVar6[3] = (int)pcVar2;
        piVar6[4] = iVar4;
        *(ushort *)((int)piVar6 + 5) = (*(ushort *)((int)piVar6 + 5) & 0xf000) + 0x540;
        *(undefined1 *)(piVar6 + 1) = 1;
        *piVar6 = DAT_0001bd7c + 0x1bc44;
        local_11d0 = local_11cc;
        piVar5 = piVar6;
      }
LAB_0001bc9a:
      if (param_2 == 0) {
        local_11e0 = 0;
      }
      else {
        local_11e0 = *param_3;
      }
      local_11e4 = 0;
      local_11d4 = 1;
      uStack_11dc = 0xffffffff;
      local_11d8 = 0xffffffff;
      local_11e8 = param_2;
      if (local_1068 != local_1064) {
                    /* WARNING: Subroutine does not return */
        FUN_0001b568(DAT_0001bd90 + 0x1bd5e,DAT_0001bd94 + 0x1bd60,0x18c,DAT_0001bd98 + 0x1bd62);
      }
      FUN_0001bd9c(piVar5,&local_11e8);
      FUN_0001bdc8(&local_11e8,0);
      if (param_3 != (int *)0x0) {
        *param_3 = local_11e4;
      }
      uVar7 = 0;
      iVar4 = local_11e8;
      goto LAB_0001bcfa;
    }
  }
LAB_0001bcf4:
  uVar7 = 0xfffffffe;
  iVar4 = 0;
LAB_0001bcfa:
  if (param_4 != (undefined4 *)0x0) {
    *param_4 = uVar7;
  }
  FUN_0001bde4(&local_11d0);
  return iVar4;
}




// ============================================================
// Function #134
// Name: FUN_0001bd9c
// Address: 0001bd9c
// JNI: NO
// ============================================================


void FUN_0001bd9c(int *param_1,undefined4 param_2)

{
  (**(code **)(*param_1 + 0x10))(param_1);
  if ((*(ushort *)((int)param_1 + 5) & 0xc0) == 0x40) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x0001bdc6. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x14))(param_1,param_2);
  return;
}




// ============================================================
// Function #135
// Name: FUN_0001bdc8
// Address: 0001bdc8
// JNI: NO
// ============================================================


int * FUN_0001bdc8(int *param_1,undefined1 param_2)

{
  int iVar1;
  
  FUN_0001be92(param_1,1);
  iVar1 = param_1[1];
  param_1[1] = iVar1 + 1;
  *(undefined1 *)(*param_1 + iVar1) = param_2;
  return param_1;
}




// ============================================================
// Function #136
// Name: FUN_0001bde4
// Address: 0001bde4
// JNI: NO
// ============================================================


int FUN_0001bde4(int param_1)

{
  undefined4 *__ptr;
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)(param_1 + 0x1198);
  while (__ptr = (undefined4 *)*puVar1, __ptr != (undefined4 *)0x0) {
    *puVar1 = *__ptr;
    if (__ptr != (undefined4 *)(param_1 + 0x198)) {
      free(__ptr);
    }
  }
  *(undefined4 *)(param_1 + 0x198) = 0;
  *(undefined4 *)(param_1 + 0x19c) = 0;
  *puVar1 = (undefined4 *)(param_1 + 0x198);
  if (*(void **)(param_1 + 0x168) != (void *)(param_1 + 0x174)) {
    free(*(void **)(param_1 + 0x168));
  }
  FUN_0001be4a(param_1 + 0x14c);
  FUN_0001be62(param_1 + 0x120);
  FUN_0001be7a(param_1 + 0x94);
  FUN_0001be7a(param_1 + 8);
  return param_1;
}




// ============================================================
// Function #137
// Name: FUN_0001be4a
// Address: 0001be4a
// JNI: NO
// ============================================================


undefined4 * FUN_0001be4a(undefined4 *param_1)

{
  if ((undefined4 *)*param_1 != param_1 + 3) {
    free((undefined4 *)*param_1);
  }
  return param_1;
}




// ============================================================
// Function #138
// Name: FUN_0001be62
// Address: 0001be62
// JNI: NO
// ============================================================


undefined4 * FUN_0001be62(undefined4 *param_1)

{
  if ((undefined4 *)*param_1 != param_1 + 3) {
    free((undefined4 *)*param_1);
  }
  return param_1;
}




// ============================================================
// Function #139
// Name: FUN_0001be7a
// Address: 0001be7a
// JNI: NO
// ============================================================


undefined4 * FUN_0001be7a(undefined4 *param_1)

{
  if ((undefined4 *)*param_1 != param_1 + 3) {
    free((undefined4 *)*param_1);
  }
  return param_1;
}




// ============================================================
// Function #140
// Name: FUN_0001be92
// Address: 0001be92
// JNI: NO
// ============================================================


void FUN_0001be92(undefined4 *param_1,int param_2)

{
  uint uVar1;
  void *pvVar2;
  size_t __size;
  
  uVar1 = param_1[2];
  if (uVar1 < (uint)(param_2 + param_1[1])) {
    __size = param_2 + param_1[1] + 0x3e0;
    if (__size < uVar1 << 1) {
      __size = uVar1 << 1;
    }
    param_1[2] = __size;
    pvVar2 = realloc((void *)*param_1,__size);
    *param_1 = pvVar2;
    if (pvVar2 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
  }
  return;
}




