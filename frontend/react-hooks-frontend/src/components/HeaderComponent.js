import React from 'react'

const HeaderComponent = () => {
  return (
    <>
        <header>
            <nav className = "navbar navbar-expand-md navbar-dark bg-dark">
                <>
                    <a href="https://mpdeveloper.vercel.app" className="navbar-brand" target='_blank' rel="noreferrer">
                        <img src="https://mpdeveloper.vercel.app/logo192.png" alt="logo" width="30" height="30" className="align-top mx-3" />
                        Employee Management System
                    </a>
                </>
            </nav>
        </header>
    </>
  )
}

export default HeaderComponent
