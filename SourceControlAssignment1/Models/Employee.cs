using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace SourceControlAssignment1.Models
{
    public class Employee
    {
        [Required (ErrorMessage ="Please enter your ID")] [StringLength(2)]
        public int EmployeeId { get; set; }

        [Required(ErrorMessage = "Please enter your Name")]
        [MaxLength(12)][MinLength(3)]
        public string EmployeeName { get; set; }
        

        [Required(ErrorMessage = "Please enter your Age")]
        [Range(18,25)]
        public int EmployeeAge { get; set; }
        
        [Required(ErrorMessage = "Please enter your Email")]
        [RegularExpression("^[a-zA-Z0-9_\\.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", ErrorMessage = "E-mail is not valid")]
        public string EmployeeEmail { get; set; }
        

        [Required(ErrorMessage = "Please enter your Gender")]
        public string EmployeeGender { get; set; }

    }
}