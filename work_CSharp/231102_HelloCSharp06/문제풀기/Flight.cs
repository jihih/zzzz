﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace 문제풀기
{
    public class Flight : IRiderable, IFlierable
    {
        public void fly()
        {
            MessageBox.Show("행복한 비행되세요~");
        }

        public void run()
        {
            MessageBox.Show("안전띠 꽉 매세요~");
        }

        public void stop()
        {
            MessageBox.Show("뱅기! 멈춰!");
        }
    }
}
