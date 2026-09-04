/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001e5ac
 * Address  : 0001e5ac
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


int * FUN_0001e5ac(undefined4 *param_1,undefined1 *param_2,int *param_3,uint param_4)

{
  byte bVar1;
  bool bVar2;
  undefined1 uVar3;
  int iVar4;
  int *piVar5;
  byte *pbVar6;
  int *piVar7;
  char *pcVar8;
  byte *pbVar9;
  uint uVar10;
  byte *pbVar11;
  int iVar12;
  bool bVar13;
  int unaff_r4;
  uint local_34;
  undefined4 uStack_24;
  
  uStack_24 = &stack0xfffffff8;
  local_34 = param_4;
  iVar4 = FUN_0001db28(param_1,&stack0xffffffd4,param_3,param_4,param_3);
  if (iVar4 == 0) {
    pbVar6 = (byte *)*param_1;
    pbVar11 = (byte *)param_1[1];
    if (param_3 == (int *)0x0) {
LAB_0001e5e8:
      bVar2 = true;
LAB_0001e5ec:
      if ((pbVar6 != pbVar11) && (*pbVar6 == 0x4c)) {
        pbVar6 = pbVar6 + 1;
        *param_1 = pbVar6;
      }
      if ((pbVar11 == pbVar6) || (bVar1 = *pbVar6, bVar1 < 0x31)) goto LAB_0001e624;
      if (bVar1 < 0x3a) {
        piVar7 = (int *)FUN_0001dd58(param_1);
      }
      else {
        if (bVar1 != 0x55) goto LAB_0001e624;
        piVar7 = (int *)FUN_0002098c(param_1,param_2);
      }
    }
    else {
      if (pbVar6 != pbVar11) {
        if (*pbVar6 != 0x46) goto LAB_0001e5e8;
        pbVar6 = pbVar6 + 1;
        bVar2 = false;
        *param_1 = pbVar6;
        goto LAB_0001e5ec;
      }
      bVar2 = true;
LAB_0001e624:
      iVar4 = FUN_0001bec0(param_1,DAT_0001e854 + 0x1e62e,2);
      if (iVar4 == 0) {
        pbVar11 = (byte *)*param_1;
        pbVar6 = (byte *)param_1[1];
        if ((pbVar6 == pbVar11) || (1 < *pbVar11 - 0x43)) {
          piVar7 = (int *)FUN_000220bc(param_1,param_2);
        }
        else {
          if (param_3 == (int *)0x0) {
            return (int *)0x0;
          }
          if (param_4 != 0) {
            return (int *)0x0;
          }
          piVar7 = param_3;
          if ((char)param_3[1] == '0') {
            piVar7 = (int *)FUN_0001dbc0(param_1 + 0x66,0xc);
            iVar12 = param_3[2];
            *(ushort *)((int)piVar7 + 5) = (*(ushort *)((int)piVar7 + 5) & 0xf000) + 0x540;
            *(undefined1 *)(piVar7 + 1) = 0x2f;
            iVar4 = DAT_0001e85c;
            piVar7[2] = iVar12;
            *piVar7 = iVar4 + 0x1e702;
            pbVar11 = (byte *)*param_1;
            pbVar6 = (byte *)param_1[1];
          }
          param_3 = piVar7;
          if (pbVar11 != pbVar6) {
            if (*pbVar11 != 0x43) {
              piVar7 = (int *)0x0;
              if ((((1 < (uint)((int)pbVar6 - (int)pbVar11)) && (*pbVar11 == 0x44)) &&
                  (uVar10 = pbVar11[1] - 0x30, uVar10 < 6)) && (uVar10 != 3)) {
                *param_1 = pbVar11 + 2;
                if (param_2 != (undefined1 *)0x0) {
                  *param_2 = 1;
                }
                uVar3 = 1;
                local_34 = uVar10;
LAB_0001e83a:
                uStack_24 = (undefined1 *)CONCAT13(uVar3,(undefined3)uStack_24);
                piVar7 = (int *)FUN_00022590(param_1,&stack0xffffffd8,(int)&uStack_24 + 3,&local_34)
                ;
              }
              goto LAB_0001e72e;
            }
            pbVar9 = pbVar11 + 1;
            *param_1 = pbVar9;
            if ((pbVar9 == pbVar6) || (*pbVar9 != 0x49)) {
              bVar13 = false;
            }
            else {
              pbVar9 = pbVar11 + 2;
              bVar13 = true;
              *param_1 = pbVar9;
            }
            if ((pbVar6 != pbVar9) && (bVar1 = *pbVar9, bVar1 - 0x31 < 5)) {
              *param_1 = pbVar9 + 1;
              local_34 = bVar1 - 0x30;
              if (param_2 != (undefined1 *)0x0) {
                *param_2 = 1;
              }
              if ((!bVar13) || (iVar4 = FUN_0001d34c(param_1,param_2), iVar4 != 0)) {
                uVar3 = 0;
                goto LAB_0001e83a;
              }
            }
          }
          piVar7 = (int *)0x0;
        }
      }
      else {
        iVar4 = param_1[2];
        iVar12 = param_1[3];
        do {
          local_34 = FUN_0001dd58(param_1);
          if (local_34 == 0) goto LAB_0001e5c6;
          FUN_0001d7c0(param_1 + 2,&local_34);
          pcVar8 = (char *)*param_1;
        } while ((pcVar8 == (char *)param_1[1]) || (*pcVar8 != 'E'));
        *param_1 = pcVar8 + 1;
        FUN_0001d830(&local_34,param_1,iVar12 - iVar4 >> 2);
        piVar7 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
        *(undefined1 *)(piVar7 + 1) = 0x35;
        *piVar7 = DAT_0001e858 + 0x1e690;
        piVar7[2] = local_34;
        piVar7[3] = unaff_r4;
        *(ushort *)((int)piVar7 + 5) = (*(ushort *)((int)piVar7 + 5) & 0xf000) + 0x540;
      }
    }
LAB_0001e72e:
    if ((piVar7 == (int *)0x0) || (param_4 == 0)) {
      if (piVar7 == (int *)0x0) goto LAB_0001e5c6;
    }
    else {
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      piVar5[2] = param_4;
      piVar5[3] = (int)piVar7;
      *(undefined1 *)(piVar5 + 1) = 0x1c;
      *piVar5 = DAT_0001e860 + 0x1e756;
      *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
      piVar7 = piVar5;
    }
    piVar7 = (int *)FUN_000222f0(param_1,piVar7);
    if (piVar7 == (int *)0x0 || bVar2) {
      if (param_3 == (int *)0x0 || piVar7 == (int *)0x0) {
        return piVar7;
      }
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      piVar5[2] = (int)param_3;
      piVar5[3] = (int)piVar7;
      *(undefined1 *)(piVar5 + 1) = 0x18;
      iVar4 = DAT_0001e868 + 0x1e7bc;
    }
    else {
      piVar5 = (int *)FUN_0001dbc0(param_1 + 0x66,0x10);
      piVar5[2] = (int)param_3;
      piVar5[3] = (int)piVar7;
      *(undefined1 *)(piVar5 + 1) = 0x19;
      iVar4 = DAT_0001e864 + 0x1e7a4;
    }
    *piVar5 = iVar4 + 8;
    *(ushort *)((int)piVar5 + 5) = (*(ushort *)((int)piVar5 + 5) & 0xf000) + 0x540;
  }
  else {
LAB_0001e5c6:
    piVar5 = (int *)0x0;
  }
  return piVar5;
}


