/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001bb0c
 * Address  : 0001bb0c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


