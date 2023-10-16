function submitForm() {
    // Validation code can be added here if needed

    // Get form values
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const genderInputs = document.querySelectorAll('input[name="gender"]:checked');
    const gender = [...genderInputs].map(input => input.value).join(', ');
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    // Display results in the popup
    const popupResults = document.getElementById('popupResults');
    popupResults.innerHTML = `
      <p><strong>First Name:</strong> ${firstName}</p>
      <p><strong>Last Name:</strong> ${lastName}</p>
      <p><strong>Date of Birth:</strong> ${dob}</p>
      <p><strong>Country:</strong> ${country}</p>
      <p><strong>Gender:</strong> ${gender}</p>
      <p><strong>Profession:</strong> ${profession}</p>
      <p><strong>Email:</strong> ${email}</p>
      <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    // Show the popup
    document.getElementById('resultPopup').style.display = 'block';
  }

  function closePopup() {
    // Hide the popup
    document.getElementById('resultPopup').style.display = 'none';

    // Reset the form
    resetForm();
  }

  function resetForm() {
    document.getElementById('surveyForm').reset();
  }