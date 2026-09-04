/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000a0040
 * Address  : 000a0040
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000a0040(int *param_1,int *param_2)

{
  ushort uVar1;
  short sVar2;
  int iVar3;
  uint uVar4;
  int *piVar5;
  int *piVar6;
  int *piVar7;
  int iVar8;
  uint uVar9;
  int iVar10;
  bool bVar11;
  undefined8 uVar12;
  longlong lVar13;
  uint local_40;
  uint local_3c;
  undefined4 local_38;
  uint local_34;
  uint local_30;
  int *local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_000a02a4 + 0xa005c);
  uVar12 = (**(code **)(*param_2 + 0x1c))(param_2);
  uVar9 = (uint)uVar12 - 0x16;
  iVar10 = (int)((ulonglong)uVar12 >> 0x20) - (uint)((uint)uVar12 < 0x16);
  if (uVar9 != 0 || iVar10 != 0) {
    do {
      iVar3 = (**(code **)(*param_2 + 0xc))(param_2,*(code **)(*param_2 + 0xc),uVar9,iVar10);
      if (iVar3 == 0) break;
      (**(code **)(*param_2 + 8))(&local_34,param_2,0x16,0);
      uVar4 = local_30;
      if ((local_34 & 1) == 0) {
        uVar4 = local_34 >> 1 & 0x7f;
      }
      if (uVar4 == 0) {
        bVar11 = false;
        *(undefined1 *)(param_1 + 3) = 0;
        *(undefined1 *)param_1 = 0;
      }
      else {
        if (uVar4 < 4) {
LAB_000a011c:
          bVar11 = false;
          *(undefined1 *)param_1 = 0;
        }
        else {
          piVar6 = local_2c;
          if ((local_34 & 1) == 0) {
            piVar6 = (int *)((uint)&local_34 | 1);
          }
          if (*piVar6 != 0x6054b50) goto LAB_000a011c;
          if (uVar4 < 0xc) {
LAB_000a0298:
                    /* WARNING: Subroutine does not return */
            FUN_00026994((int)&DAT_000a02a4 + DAT_000a02ac);
          }
          piVar6 = local_2c + 3;
          if ((local_34 & 1) == 0) {
            piVar6 = (int *)((int)&local_28 + 1);
          }
          if (uVar4 < 0x10) goto LAB_000a0298;
          piVar7 = local_2c + 4;
          if ((local_34 & 1) == 0) {
            piVar7 = (int *)&stack0xffffffdd;
          }
          if (uVar4 < 0x14) goto LAB_000a0298;
          piVar5 = local_2c + 5;
          if ((local_34 & 1) == 0) {
            piVar5 = (int *)&stack0xffffffe1;
          }
          iVar3 = *piVar6;
          sVar2 = (short)*piVar5;
          iVar8 = *piVar7;
          if (sVar2 == 0) {
LAB_000a0248:
            *param_1 = iVar3;
            param_1[1] = iVar8;
            bVar11 = true;
            *(short *)(param_1 + 2) = sVar2;
          }
          else {
            (**(code **)(*param_2 + 8))(&local_40,param_2,sVar2,0);
            uVar4 = local_3c;
            if ((local_40 & 1) == 0) {
              uVar4 = local_40 >> 1 & 0x7f;
            }
            else {
              FUN_00023f68(local_38,local_40 & 0xfffffffe);
            }
            if (uVar4 != 0) goto LAB_000a0248;
            bVar11 = false;
            *(undefined1 *)param_1 = 0;
          }
        }
        *(bool *)(param_1 + 3) = bVar11;
      }
      if ((local_34 & 1) != 0) {
        FUN_00023f68(local_2c,local_34 & 0xfffffffe);
      }
      if ((bVar11) &&
         (uVar1 = *(ushort *)(param_1 + 2), lVar13 = (**(code **)(*param_2 + 0x1c))(param_2),
         lVar13 == CONCAT44(iVar10 + (uint)CARRY4(uVar9,uVar1 + 0x16),uVar9 + uVar1 + 0x16)))
      goto LAB_000a0274;
      bVar11 = uVar9 == 0;
      uVar9 = uVar9 - 1;
      iVar10 = iVar10 - (uint)bVar11;
    } while (uVar9 != 0 || iVar10 != 0);
  }
  *(undefined1 *)(param_1 + 3) = 0;
  *(undefined1 *)param_1 = 0;
LAB_000a0274:
  if (**(int **)(DAT_000a02a8 + 0xa0284) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


