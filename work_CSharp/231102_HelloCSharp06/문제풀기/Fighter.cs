﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 문제풀기
{
    public class Fighter : GameCharacter
    {
        public override void fight()
        {
            MessageBox.Show("주먹으로 때려요");
        }
    }
}
